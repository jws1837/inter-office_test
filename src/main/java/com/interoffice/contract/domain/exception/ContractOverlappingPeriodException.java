package com.interoffice.contract.domain.exception;

public class ContractOverlappingPeriodException extends RuntimeException{
  public ContractOverlappingPeriodException() {
    super("duration of contract is existed");
  }

}
