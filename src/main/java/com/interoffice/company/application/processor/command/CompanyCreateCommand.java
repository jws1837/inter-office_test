package com.interoffice.company.application.processor.command;

import com.interoffice.contract.domain.Contract;

public class CompanyCreateCommand {
  private String name;
  private String businessRegistrationNumber;
  private long contractId;
  private long officeId;
  private long creditId;

  public CompanyCreateCommand(String name, String businessRegistrationNumber,
      long contractId, long officeId, long creditId) {
    this.name = name;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.contractId = contractId;
    this.officeId = officeId;
    this.creditId = creditId;
  }

  public CompanyCreateCommand(Contract contract) {
    this.name = contract.getCompanyName();
    this.contractId = contract.getId();
    this.businessRegistrationNumber = contract.getBusinessRegistrationNumber();
    this.officeId = 0L; // TODO
    this.creditId = 0L; // TODO
  }

  public String getName() {
    return name;
  }

  public String getBusinessRegistrationNumber() {
    return businessRegistrationNumber;
  }

  public long getContractId() {
    return contractId;
  }

  public long getOfficeId() {
    return officeId;
  }

  public long getCreditId() {
    return creditId;
  }
}
