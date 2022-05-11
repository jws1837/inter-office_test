package com.interoffice.account.domain.repository;

import com.interoffice.account.domain.Account;

public interface AccountRepository {
  Account save(Account account);
  Account findById(long id);
  Account findByEmail(String email);

}
