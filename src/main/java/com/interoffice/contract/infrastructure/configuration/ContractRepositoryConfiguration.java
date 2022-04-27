package com.interoffice.contract.infrastructure.configuration;

import com.interoffice.contract.domain.repository.ContractRepository;
import com.interoffice.contract.infrastructure.persistance.ContractRepositoryAdapter;
import com.interoffice.contract.infrastructure.persistance.memory.InMemoryContractRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContractRepositoryConfiguration {
  @Bean
  public ContractRepository contractRepository(InMemoryContractRepository inMemoryContractRepository) {
    return new ContractRepositoryAdapter(inMemoryContractRepository);
  }

  @Bean
  public InMemoryContractRepository inMemoryContractRepository() {
    return new InMemoryContractRepository();
  }

}
