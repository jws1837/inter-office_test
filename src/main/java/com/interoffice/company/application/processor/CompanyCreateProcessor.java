package com.interoffice.company.application.processor;

import com.interoffice.company.application.processor.command.CompanyCreateCommand;
import com.interoffice.company.application.processor.data.CompanyData;
import com.interoffice.company.domain.Company;
import com.interoffice.company.domain.exception.CompanyDuplicationException;
import com.interoffice.company.domain.repository.CompanyRepository;

public class CompanyCreateProcessor {
  private CompanyRepository companyRepository;

  public CompanyCreateProcessor(
      CompanyRepository companyRepository) {
    this.companyRepository = companyRepository;
  }

  private boolean isExist(String businessRegistrationNumber) {
    return null != companyRepository.findByBusinessRegistrationNumber(businessRegistrationNumber);
  }

  public CompanyData execute(CompanyCreateCommand command) {
    if (isExist(command.getBusinessRegistrationNumber())) {
      throw new CompanyDuplicationException();
    }

    Company company = new Company(
        command.getName(),
        command.getBusinessRegistrationNumber(),
        command.getRepresentMemberId()
    );

    companyRepository.save(company);

    return CompanyData.from(company);
  }

}
