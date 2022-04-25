package com.interoffice.contract.application.processor;

import com.interoffice.contract.application.processor.command.ContractCreateCommand;
import com.interoffice.contract.application.processor.data.ContractData;
import com.interoffice.contract.domain.Contract;
import com.interoffice.contract.domain.exception.ContractOverlappingPeriodException;
import com.interoffice.contract.domain.repository.ContractRepository;
import java.sql.Timestamp;

public class ContractCreateProcessor {
  private ContractRepository contractRepository;

  public ContractCreateProcessor(
      ContractRepository contractRepository) {
    this.contractRepository = contractRepository;
  }

  public boolean isExist(Timestamp start, Timestamp end) {
    return null != contractRepository.findByStartDateAndExpireDate(start, end);
  }

  public ContractData execute(ContractCreateCommand command) {
    Timestamp start = Timestamp.valueOf(command.getStartDate() + " 00:00:00");
    Timestamp end = Timestamp.valueOf(command.getExpireDate() + " 00:00:00");

    if (isExist(start, end)) {
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
        start,
        end
    );

    contractRepository.save(contract);

    return ContractData.from(contract);
  }
}
