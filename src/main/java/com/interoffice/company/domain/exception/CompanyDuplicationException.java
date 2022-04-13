package com.interoffice.company.domain.exception;

public class CompanyDuplicationException extends RuntimeException{
  public CompanyDuplicationException() {
    super("business registration number is duplicated");
  }
}
