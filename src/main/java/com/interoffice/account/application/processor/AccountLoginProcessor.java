package com.interoffice.account.application.processor;

import com.interoffice.account.application.processor.command.AccountLoginCommand;
import com.interoffice.account.application.processor.data.AccountData;
import com.interoffice.account.domain.Account;
import com.interoffice.account.domain.PasswordEncoder;
import com.interoffice.account.domain.exception.AccountNotFoundException;
import com.interoffice.account.domain.repository.AccountRepository;

public class AccountLoginProcessor {
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    public AccountLoginProcessor(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public AccountData execute(AccountLoginCommand command) {

        Account account = accountRepository.findByEmail(command.getEmail());
        if (null == account) {
            throw new AccountNotFoundException();
        }
        if (!account.validatePassword(passwordEncoder, command.getPassword())) {
            throw new AccountNotFoundException();
        }
        return AccountData.from(account);
    }
}