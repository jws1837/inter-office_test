package com.interoffice.company.domain;

import java.time.Instant;

public class Company {

  private long id = 0L;

  private String name;
  private String businessRegistrationNumber;
  // TODO: 회사 대표 정보 연결 로직 별도 설계 필요
  private long representMemberId;

  private Instant createdAt;
  private Instant updatedAt;

  public Company(String name, String businessRegistrationNumber, long representMemberId) {
    this.name = name;
    this.businessRegistrationNumber = businessRegistrationNumber;
    this.representMemberId = representMemberId;
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

  public long getRepresentMemberId() {
    return representMemberId;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }
}
