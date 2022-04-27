package com.interoffice.company.application.processor.command;


public class CompanyCreateCommand {
  private String name;
  private String businessRegistrationNumber;
  // TODO: 회사 대표 정보 연결 로직 별도 설계 필요
  private long representMemberId;

  public CompanyCreateCommand(String name, String businessRegistrationNumber,
      long representMemberId) {
    this.name = name;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.representMemberId = representMemberId;
  }

  public String getName() {
    return name;
  }

  public String getBusinessRegistrationNumber() {
    return businessRegistrationNumber;
  }

  public long getRepresentMemberId() {
    return representMemberId;
  }
}
