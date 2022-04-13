package com.interoffice.contract.infrastructure.persistance;

import com.interoffice.contract.domain.Contract;
import com.interoffice.contract.domain.repository.ContractRepository;
import com.interoffice.contract.infrastructure.persistance.memory.InMemoryContractRepository;
import org.springframework.stereotype.Repository;

public class ContractRepositoryAdapter implements ContractRepository {
  private InMemoryContractRepository inMemoryContractRepository;

  public ContractRepositoryAdapter(
      InMemoryContractRepository inMemoryContractRepository) {
    this.inMemoryContractRepository = inMemoryContractRepository;
  }

  @Override
  public Contract save(Contract contract) {
    return inMemoryContractRepository.save(contract);
  }

}
