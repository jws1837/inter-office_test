package com.interoffice.company.domain.exception;

public class CompanyNotFoundException extends NullPointerException{
  public CompanyNotFoundException() {
    super("company is not existed");
  }

}
