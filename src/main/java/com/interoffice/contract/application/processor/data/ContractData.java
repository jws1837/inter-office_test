package com.interoffice.contract.application.processor.data;

import com.interoffice.company.application.processor.data.CompanyData;
import com.interoffice.contract.domain.Contract;
import java.time.Instant;

public class ContractData {
  private long id;
  private String companyName; // 회사 이름
  private String businessRegistrationNumber;  // 사업자등록번호
  private String representation;  // 대표 이름;
  private String phoneNumber; // 회사 대표 번호;
  private long resignUnit;  // 재계약 단위 (월)
  private long amount;  // 결제 금액;
  private String expiredDate;  // 계약 만료일
  private CompanyData companyData;

  public ContractData(long id, String companyName, String businessRegistrationNumber, String representation,
      String phoneNumber, long resignUnit, long amount, String expiredDate, CompanyData companyData) {
    this.id = id;
    this.companyName = companyName;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.representation = representation;
    this.phoneNumber = phoneNumber;
    this.resignUnit = resignUnit;
    this.amount = amount;
    this.expiredDate = expiredDate;
    this.companyData = companyData;
  }

  public static ContractData from(Contract contract, CompanyData companyData) {
    return new ContractData(
        contract.getId(),
        contract.getCompanyName(),
        contract.getBusinessRegistrationNumber(),
        contract.getRepresentation(),
        contract.getPhoneNumber(),
        contract.getResignUnit(),
        contract.getAmount(),
        contract.getExpiredDate(),
        companyData
    );
  }

  public long getId() {
    return id;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getBusinessRegistrationNumber() {
    return businessRegistrationNumber;
  }

  public String getRepresentation() {
    return representation;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public long getResignUnit() {
    return resignUnit;
  }

  public long getAmount() {
    return amount;
  }

  public String getExpiredDate() {
    return expiredDate;
  }
}
