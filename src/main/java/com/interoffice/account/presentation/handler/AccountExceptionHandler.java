package com.interoffice.account.presentation.handler;

import com.interoffice.account.domain.exception.AccountNotFoundException;
import com.interoffice.shared.api.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AccountExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ApiResponse<?> handle(Exception ex) {
        return ApiResponse.fail("4000", "중복된 이메일입니다. ");
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(AccountNotFoundException.class)
    public ApiResponse<?> handle2(Exception ex) {
        return ApiResponse.fail("4001", "이메일을 찾을 수 없습니다.  ");
    }
}

