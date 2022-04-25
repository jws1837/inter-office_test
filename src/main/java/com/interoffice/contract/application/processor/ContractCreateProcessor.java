package com.interoffice.contract.application.processor;

import com.interoffice.contract.application.processor.command.ContractCreateCommand;
import com.interoffice.contract.application.processor.data.ContractData;
import com.interoffice.contract.domain.Contract;
import com.interoffice.contract.domain.repository.ContractRepository;

public class ContractCreateProcessor {
  private ContractRepository contractRepository;

  public ContractCreateProcessor(
      ContractRepository contractRepository) {
    this.contractRepository = contractRepository;
  }

  public ContractData execute(ContractCreateCommand command) {
    Contract contract = new Contract(
        command.getName(),
        command.getBusinessRegistrationNumber(),
        command.getRepresentation(),
        command.getPhoneNumber(),
        command.getResignUnit(),
        command.getAmount(),
        command.getExpiredDate()
    );

    contractRepository.save(contract);

    return ContractData.from(contract);
  }
}
