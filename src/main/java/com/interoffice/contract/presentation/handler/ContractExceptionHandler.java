package com.interoffice.contract.presentation.handler;

import com.interoffice.contract.domain.exception.ContractOverlappingPeriodException;
import com.interoffice.shared.api.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ContractExceptionHandler {
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(ContractOverlappingPeriodException.class)
  public ApiResponse<?> handle(ContractOverlappingPeriodException ex) {
    return ApiResponse.fail(
        "DURATION_OF_CONTRACT_EXISTED",
        "duration of contract is existed"
    );
  }
}
