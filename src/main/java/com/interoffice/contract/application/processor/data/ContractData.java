package com.interoffice.contract.application.processor.data;

import com.interoffice.contract.domain.Contract;
import java.sql.Timestamp;
import java.time.Instant;

public class ContractData {
  private long id;
  private String companyName; // 회사명
  private String businessRegistrationNumber;  // 사업자등록번호
  private String representation;  // 대표 이름
  private String phoneNumber;  // 회사 대표 번호
  private boolean isAutoResigned;  // 자동 재계약 여부
  private long resignUnit;  // 재계약 단위 (월)
  private long amount;  // 결제 금액
  private Timestamp start;  // 계약 시작일
  private Timestamp end;  // 계약 만료일

  public ContractData(long id, String companyName, String businessRegistrationNumber,
      String representation, String phoneNumber, boolean isAutoResigned, long resignUnit,
      long amount, Timestamp start, Timestamp end) {
    this.id = id;
    this.companyName = companyName;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.representation = representation;
    this.phoneNumber = phoneNumber;
    this.isAutoResigned = isAutoResigned;
    this.resignUnit = resignUnit;
    this.amount = amount;
    this.start = start;
    this.end = end;
  }

  public static ContractData from(Contract contract) {
    return new ContractData(
        contract.getId(),
        contract.getCompanyName(),
        contract.getBusinessRegistrationNumber(),
        contract.getRepresentation(),
        contract.getPhoneNumber(),
        contract.isAutoResigned(),
        contract.getResignUnit(),
        contract.getAmount(),
        contract.getStartDate(),
        contract.getExpireDate()
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

  public boolean isAutoResigned() {
    return isAutoResigned;
  }

  public long getResignUnit() {
    return resignUnit;
  }

  public long getAmount() {
    return amount;
  }

  public Timestamp getStart() {
    return start;
  }

  public Timestamp getEnd() {
    return end;
  }
}
