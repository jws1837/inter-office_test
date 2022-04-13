package com.interoffice.company.application.processor.data;

import com.interoffice.company.domain.Company;
import com.interoffice.contract.domain.Contract;

public class CompanyData {
  private long id;
  private String name;
  private String businessRegistrationNumber;
  private long contractId;
  private long officeId;
  private long creditId;

  public CompanyData(long id, String name, String businessRegistrationNumber, long contractId,
      long officeId, long creditId) {
    this.id = id;
    this.name = name;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.contractId = contractId;
    this.officeId = officeId;
    this.creditId = creditId;
  }

  public static CompanyData from(Company company) {
    return new CompanyData(
        company.getId(),
        company.getName(),
        company.getBusinessRegistrationNumber(),
        company.getContractId(),
        company.getOfficeId(),
        company.getCreditId()
    );
  }

  public long getId() {
    return id;
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
