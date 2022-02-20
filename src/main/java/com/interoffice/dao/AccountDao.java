package com.interoffice.dao;

import com.interoffice.dto.Account;
import org.springframework.stereotype.Repository;


/**
 * id,password관련 정보를 db에 접근해서 획득하는 클래스입니다.
 *
 */
@Repository
public class AccountDao {

  public Account getAccount(String id, String password) {
    Account account = new Account(id, password);
    return account;
  }

}
