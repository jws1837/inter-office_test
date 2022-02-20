package com.interoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.interoffice.dao.AccountDAO;
import com.interoffice.domain.Account;

@Service
public class LoginServiceImpl implements LoginService {
  @Autowired
  AccountDAO dao;

  public Account signIn() {
    Account account = dao.getAccount();
    return account;



  }

}
