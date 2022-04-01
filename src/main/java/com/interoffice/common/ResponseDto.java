package com.interoffice.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Builder;

public class ResponseDto {

  private int status;
  private String msg;

  @JsonInclude(Include.NON_NULL)
  private Object results;

  @Builder
  public ResponseDto(int status, String msg) {
    this.status = status;
    this.msg = msg;
  }
}
