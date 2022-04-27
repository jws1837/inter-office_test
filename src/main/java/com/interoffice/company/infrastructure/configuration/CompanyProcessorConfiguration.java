package com.interoffice.company.infrastructure.configuration;

import com.interoffice.company.application.processor.CompanyCreateProcessor;
import com.interoffice.company.domain.repository.CompanyRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyProcessorConfiguration {
  @Bean
  public CompanyCreateProcessor companyCreateProcessor(
      CompanyRepository companyRepository) {
    return new CompanyCreateProcessor(companyRepository);
  }

}
