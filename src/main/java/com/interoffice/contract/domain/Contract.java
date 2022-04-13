package com.interoffice.contract.domain;

import java.time.Instant;

public class Contract {
  private long id = 0L;

  private String companyName; // 회사명
  private String businessRegistrationNumber;  // 사업자등록번호
  private String representation;  // 대표 이름;
  private String phoneNumber; // 회사 대표 번호;
  private long resignUnit;  // 재계약 단위 (월)
  private long amount;  // 결제 금액;
  private String expiredDate;  // 계약 만료일

  private Instant createdAt;
  private Instant updatedAt;

  public Contract(String companyName, String businessRegistrationNumber,
      String representation, String phoneNumber, long resignUnit, long amount,
      String expiredDate) {
    this.companyName = companyName;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.representation = representation;
    this.phoneNumber = phoneNumber;
    this.resignUnit = resignUnit;
    this.amount = amount;
    this.expiredDate = expiredDate;
    this.createdAt = Instant.now();
    this.updatedAt = this.createdAt;
  }

  public void setId(long id) {
    this.id = id;
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

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }
}
