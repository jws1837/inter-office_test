package com.interoffice.account.infrastructure.persistence;

import com.interoffice.account.domain.Account;

public class AccountRepositoryAdapter implements AccountRepository {

  private final JdbcTemplateAccountRepository accountRepository;


  public AccountRepositoryAdapter(
      JdbcTemplateAccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @Override
  public Account save(Account account) {
    return accountRepository.save(account);
  }


  @Override
  public Account findByEmail(String email) {
    return accountRepository.findByEmail(email);
  }
}
