package com.interoffice.company.infrastructure.configuration;

import com.interoffice.company.domain.repository.CompanyRepository;
import com.interoffice.company.infrastructure.CompanyRepositoryAdapter;
import com.interoffice.company.infrastructure.memory.InMemoryCompanyRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyRepositoryConfiguration {
  @Bean
  public CompanyRepository companyRepository(InMemoryCompanyRepository inMemoryCompanyRepository) {
    return new CompanyRepositoryAdapter(inMemoryCompanyRepository);
  }

  @Bean
  public InMemoryCompanyRepository inMemoryCompanyRepository() {
    return new InMemoryCompanyRepository();
  }

}
