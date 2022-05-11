package com.interoffice.account.domain.exception;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException() {
        super("account not found");
    }
}
