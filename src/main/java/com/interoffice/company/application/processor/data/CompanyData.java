package com.interoffice.company.application.processor.data;

import com.interoffice.company.domain.Company;

public class CompanyData {
  private long id;
  private String name;
  private String businessRegistrationNumber;
  // TODO: 회사 대표 정보 연결 로직 별도 설계 필요
  private long representMemberId;

  public CompanyData(long id, String name, String businessRegistrationNumber, long representMemberId) {
    this.id = id;
    this.name = name;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.representMemberId = representMemberId;
  }

  public static CompanyData from(Company company) {
    return new CompanyData(
        company.getId(),
        company.getName(),
        company.getBusinessRegistrationNumber(),
        company.getRepresentMemberId()
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

  public long getRepresentMemberId() {
    return representMemberId;
  }
}
