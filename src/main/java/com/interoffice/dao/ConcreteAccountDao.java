package com.interoffice.dao;

import com.interoffice.dto.Account;
import org.springframework.stereotype.Repository;


/**
 * 구체적인 Dao 구현체입니다. 
 *
 */
@Repository
public class ConcreteAccountDao implements AccountDao {

  @Override
  public Account getAccount() {

    return null;
  }

}
