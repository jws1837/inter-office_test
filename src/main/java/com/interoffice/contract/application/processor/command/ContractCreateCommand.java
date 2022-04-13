package com.interoffice.contract.application.processor.command;

import java.time.Instant;

public class ContractCreateCommand {
  private String name; // 회사명
  private String businessRegistrationNumber;  // 사업자등록번호
  private String representation;  // 대표 이름;
  private String phoneNumber; // 회사 대표 번호;
  private long resignUnit;  // 재계약 단위 (월)
  private long amount;  // 결제 금액;
  private String expiredDate;  // 계약 만료일

  public ContractCreateCommand(String companyName, String businessRegistrationNumber,
      String representation, String phoneNumber, long resignUnit, long amount,
      String expiredDate) {
    this.name = companyName;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.representation = representation;
    this.phoneNumber = phoneNumber;
    this.resignUnit = resignUnit;
    this.amount = amount;
    this.expiredDate = expiredDate;
  }

  public String getName() {
    return name;
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
