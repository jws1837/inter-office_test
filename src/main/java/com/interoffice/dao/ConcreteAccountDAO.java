package com.interoffice.dao;

import org.springframework.stereotype.Repository;
import com.interoffice.domain.Account;


@Repository
public class ConcreteAccountDAO implements AccountDAO {

  @Override
  public Account getAccount() {

    return null;
  }

}
