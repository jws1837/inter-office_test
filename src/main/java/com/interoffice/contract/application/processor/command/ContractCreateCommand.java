package com.interoffice.contract.application.processor.command;


public class ContractCreateCommand {
  private String companyName; // 회사명
  private String businessRegistrationNumber;  // 사업자등록번호
  private String representation;  // 대표 이름
  private String phoneNumber;  // 회사 대표 번호
  private boolean isAutoResigned;  // 자동 재계약 여부
  private long resignUnit;  // 재계약 단위 (월)
  private long amount;  // 결제 금액
  private String startDate;  // 계약 시작일
  private String expireDate;  // 계약 만료일

  public ContractCreateCommand(String companyName, String businessRegistrationNumber,
      String representation, String phoneNumber, boolean isAutoResigned, long resignUnit,
      long amount,
      String startDate, String expireDate) {
    this.companyName = companyName;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.representation = representation;
    this.phoneNumber = phoneNumber;
    this.isAutoResigned = isAutoResigned;
    this.resignUnit = resignUnit;
    this.amount = amount;
    this.startDate = startDate;
    this.expireDate = expireDate;
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

  public boolean isAutoResigned() {
    return isAutoResigned;
  }

  public long getResignUnit() {
    return resignUnit;
  }

  public long getAmount() {
    return amount;
  }

  public String getStartDate() {
    return startDate;
  }

  public String getExpireDate() {
    return expireDate;
  }
}
