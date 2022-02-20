package com.interoffice.service;

import com.interoffice.dao.AccountDao;
import com.interoffice.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *로그인 구현체.
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
  @Autowired
  AccountDao dao;

  /**
   *로그인 함수.
   */
  public Account signIn() {
    Account account = dao.getAccount();
    return account;



  }

}
