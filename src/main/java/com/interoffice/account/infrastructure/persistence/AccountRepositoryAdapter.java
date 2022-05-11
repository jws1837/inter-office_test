package com.interoffice.account.infrastructure.persistence;

import com.interoffice.account.domain.Account;
import com.interoffice.account.domain.repository.AccountRepository;
import com.interoffice.account.infrastructure.persistence.memory.InMemroyAccountRepository;

public class AccountRepositoryAdapter implements AccountRepository {

  private final InMemroyAccountRepository inMemroyAccountRepository;


  public AccountRepositoryAdapter(
      InMemroyAccountRepository inMemroyAccountRepository) {
    this.inMemroyAccountRepository = inMemroyAccountRepository;
  }

  @Override
  public Account save(Account account) {
    return inMemroyAccountRepository.save(account);
  }

  @Override
  public Account findById(long id) {
    return inMemroyAccountRepository.findById(id);
  }

  @Override
  public Account findByEmail(String email) {
    return inMemroyAccountRepository.findByEmail(email);
  }
}
