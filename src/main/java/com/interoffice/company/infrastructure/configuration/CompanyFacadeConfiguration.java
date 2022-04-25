package com.interoffice.company.infrastructure.configuration;

import com.interoffice.company.application.facade.CompanyFacade;
import com.interoffice.company.application.processor.CompanyCreateProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyFacadeConfiguration {
  @Bean
  public CompanyFacade companyFacade(
      CompanyCreateProcessor companyCreateProcessor
  ) {
    return new CompanyFacade(
        companyCreateProcessor
    );
  }

}
