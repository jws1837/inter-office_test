package com.interoffice.contract.infrastructure.configuration;

import com.interoffice.company.application.processor.CompanyCreateProcessor;
import com.interoffice.contract.application.processor.ContractCreateProcessor;
import com.interoffice.contract.domain.repository.ContractRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContractProcessorConfiguration {
  @Bean
  public ContractCreateProcessor contractCreateProcessor(
      ContractRepository contractRepository,
      CompanyCreateProcessor companyCreateProcessor) {
    return new ContractCreateProcessor(contractRepository, companyCreateProcessor);
  }

}
