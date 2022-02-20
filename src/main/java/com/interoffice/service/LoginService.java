package com.interoffice.service;

import org.springframework.stereotype.Service;
import com.interoffice.domain.Account;

@Service
public interface LoginService {

  Account signIn();

}
