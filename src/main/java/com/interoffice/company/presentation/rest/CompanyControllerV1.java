package com.interoffice.company.presentation.rest;

import com.interoffice.company.application.facade.CompanyFacade;
import com.interoffice.company.application.processor.command.CompanyCreateCommand;
import com.interoffice.company.application.processor.data.CompanyData;
import com.interoffice.shared.api.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/company")
@RestController
public class CompanyControllerV1 {
  private final CompanyFacade companyFacade;

  public CompanyControllerV1(CompanyFacade companyFacade) {
    this.companyFacade = companyFacade;
  }

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public ApiResponse<CompanyData> createCompany(@RequestBody CompanyCreateCommand command) {
    CompanyData companyData = companyFacade.createCompany(command);
    return ApiResponse.success(companyData);
  }
}
