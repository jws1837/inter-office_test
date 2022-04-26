package com.interoffice.contract.application.processor;

import com.interoffice.contract.application.processor.command.ContractCreateCommand;
import com.interoffice.contract.application.processor.data.ContractData;
import com.interoffice.contract.domain.Contract;
import com.interoffice.contract.domain.exception.ContractOverlappingPeriodException;
import com.interoffice.contract.domain.repository.ContractRepository;
import java.time.LocalDate;

public class ContractCreateProcessor {
  private ContractRepository contractRepository;

  public ContractCreateProcessor(
      ContractRepository contractRepository) {
    this.contractRepository = contractRepository;
  }

  private boolean isExist(LocalDate start, LocalDate end) {
    return null != contractRepository.findByStartDateAndExpireDate(start, end);
  }

  public ContractData execute(ContractCreateCommand command) {
    if (isExist(command.getStartDate(), command.getExpireDate())) {
      throw new ContractOverlappingPeriodException();
    }

    Contract contract = new Contract(
        command.getCompanyName(),
        command.getBusinessRegistrationNumber(),
        command.getRepresentation(),
        command.getPhoneNumber(),
        command.isAutoResigned(),
        command.getResignUnit(),
        command.getAmount(),
        command.getStartDate(),
        command.getExpireDate()
    );

    contractRepository.save(contract);

    return ContractData.from(contract);
  }
}
