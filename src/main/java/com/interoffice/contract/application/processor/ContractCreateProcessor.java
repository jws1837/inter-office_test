package com.interoffice.contract.application.processor;

import com.interoffice.company.application.processor.CompanyCreateProcessor;
import com.interoffice.company.domain.exception.CompanyNotFoundException;
import com.interoffice.contract.application.processor.command.ContractCreateCommand;
import com.interoffice.contract.application.processor.data.ContractData;
import com.interoffice.contract.domain.Contract;
import com.interoffice.contract.domain.exception.ContractOverlappingPeriodException;
import com.interoffice.contract.domain.repository.ContractRepository;
import java.time.LocalDate;

public class ContractCreateProcessor {
  private ContractRepository contractRepository;
  private CompanyCreateProcessor companyCreateProcessor;

  public ContractCreateProcessor(
      ContractRepository contractRepository,
      CompanyCreateProcessor companyCreateProcessor) {
    this.contractRepository = contractRepository;
    this.companyCreateProcessor = companyCreateProcessor;
  }

  private boolean isExist(LocalDate start, LocalDate end, String businessRegistrationNumber) {
    return
        null != contractRepository.findByBusinessRegistrationNumberAndStartDateAndExpireDate(
            businessRegistrationNumber, start, end);
  }

  public ContractData execute(ContractCreateCommand command) {
    if (!companyCreateProcessor.isExist(command.getBusinessRegistrationNumber())) {
      throw new CompanyNotFoundException();
    }

    if (isExist(command.getStartDate(), command.getExpireDate(), command.getBusinessRegistrationNumber())) {
      throw new ContractOverlappingPeriodException();
    }

    long companyId = companyCreateProcessor.getId(command.getBusinessRegistrationNumber());

    Contract contract = new Contract(
        companyId,
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
