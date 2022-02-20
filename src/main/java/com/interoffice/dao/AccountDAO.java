package com.interoffice.dao;

import org.springframework.stereotype.Repository;
import com.interoffice.domain.Account;
@Repository
public interface AccountDAO {
  Account getAccount();

}
