package com.interoffice.contract.presentation.rest;

import com.interoffice.contract.application.facade.ContractFacade;
import com.interoffice.contract.application.processor.command.ContractCreateCommand;
import com.interoffice.contract.application.processor.data.ContractData;
import com.interoffice.shared.api.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/contract")
@RestController
public class ContractControllerV1 {
  private final ContractFacade contractFacade;

  public ContractControllerV1(
      ContractFacade contractFacade) {
    this.contractFacade = contractFacade;
  }

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public ApiResponse<ContractData> createContract(@RequestBody ContractCreateCommand command) {
    ContractData contractData = contractFacade.createContract(command);
    return ApiResponse.success(contractData);
  }
}
