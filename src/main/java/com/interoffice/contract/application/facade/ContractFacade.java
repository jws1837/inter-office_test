package com.interoffice.contract.application.facade;

import com.interoffice.contract.application.processor.ContractCreateProcessor;
import com.interoffice.contract.application.processor.command.ContractCreateCommand;
import com.interoffice.contract.application.processor.data.ContractData;

public class ContractFacade {
  private final ContractCreateProcessor contractCreateProcessor;

  public ContractFacade(
      ContractCreateProcessor contractCreateProcessor) {
    this.contractCreateProcessor = contractCreateProcessor;
  }

  public ContractData createContract(ContractCreateCommand command) {
    return contractCreateProcessor.execute(command);
  }
}
