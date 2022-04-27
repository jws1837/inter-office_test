package com.interoffice.contract.infrastructure.configuration;

import com.interoffice.contract.application.facade.ContractFacade;
import com.interoffice.contract.application.processor.ContractCreateProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContractFacadeConfiguration {
  @Bean
  public ContractFacade contractFacade(
      ContractCreateProcessor contractCreateProcessor
  ) {
    return new ContractFacade(
        contractCreateProcessor
    );
  }

}
