package com.interoffice.company.domain;

import java.time.Instant;

public class Company {

  private long id = 0L;

  private String name;
  private String businessRegistrationNumber;

  private long contractId;
  private long officeId;
  private long creditId;

  private Instant createdAt;
  private Instant updatedAt;

  public Company(String name, String businessRegistrationNumber, long contractId,
      long officeId, long creditId) {
    this.name = name;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.contractId = contractId;
    this.officeId = officeId;
    this.creditId = creditId;
    this.createdAt = Instant.now();
    this.updatedAt = this.createdAt;
  }

  public void setId(long id) {
    this.id = id;
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

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }
}
