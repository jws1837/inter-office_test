package com.interoffice.company.application.facade;

import com.interoffice.company.application.processor.CompanyCreateProcessor;
import com.interoffice.company.application.processor.command.CompanyCreateCommand;
import com.interoffice.company.application.processor.data.CompanyData;

public class CompanyFacade {
  private final CompanyCreateProcessor companyCreateProcessor;

  public CompanyFacade(
      CompanyCreateProcessor companyCreateProcessor) {
    this.companyCreateProcessor = companyCreateProcessor;
  }

  public CompanyData createCompany(CompanyCreateCommand command) {
    return companyCreateProcessor.execute(command);
  }
}
