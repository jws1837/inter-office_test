package com.interoffice.contract.domain;

import java.time.Instant;
import java.time.LocalDate;

public class Contract {
  private long id = 0L;

  private long companyId;
  private String companyName; // 회사명
  private String businessRegistrationNumber;  // 사업자등록번호
  private String representation;  // 대표 이름
  private String phoneNumber;  // 회사 대표 번호
  private boolean isAutoResigned;  // 자동 재계약 여부
  private long resignUnit;  // 재계약 단위 (월)
  private long amount;  // 결제 금액
  private LocalDate startDate;  // 계약 시작일
  private LocalDate expireDate;  // 계약 만료일

  private Instant createdAt;
  private Instant updatedAt;

  public Contract(long companyId, String companyName, String businessRegistrationNumber,
      String representation, String phoneNumber, boolean isAutoResigned, long resignUnit, long amount,
      LocalDate start, LocalDate end) {
    this.companyId = companyId;
    this.companyName = companyName;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.representation = representation;
    this.phoneNumber = phoneNumber;
    this.isAutoResigned = isAutoResigned;
    this.resignUnit = resignUnit;
    this.amount = amount;
    this.startDate = start;
    this.expireDate = end;
    this.createdAt = Instant.now();
    this.updatedAt = this.createdAt;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public long getCompanyId() {
    return companyId;
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

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getExpireDate() {
    return expireDate;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }
}
