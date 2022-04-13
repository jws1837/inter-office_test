package com.interoffice.contract.application.processor;

import com.interoffice.company.application.processor.CompanyCreateProcessor;
import com.interoffice.company.application.processor.command.CompanyCreateCommand;
import com.interoffice.company.application.processor.data.CompanyData;
import com.interoffice.company.domain.exception.CompanyDuplicationException;
import com.interoffice.contract.application.processor.command.ContractCreateCommand;
import com.interoffice.contract.application.processor.data.ContractData;
import com.interoffice.contract.domain.Contract;
import com.interoffice.contract.domain.repository.ContractRepository;

public class ContractCreateProcessor {
  private ContractRepository contractRepository;

  private CompanyCreateProcessor companyCreateProcessor;

  public ContractCreateProcessor(
      ContractRepository contractRepository,
      CompanyCreateProcessor companyCreateProcessor) {
    this.contractRepository = contractRepository;
    this.companyCreateProcessor = companyCreateProcessor;
  }

  public ContractData execute(ContractCreateCommand command) {
    if (companyCreateProcessor.isExist(command.getBusinessRegistrationNumber())) {
      throw new CompanyDuplicationException();
    }

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

    CompanyData companyData = companyCreateProcessor.execute(new CompanyCreateCommand(contract));

    return ContractData.from(contract, companyData);
  }
}
