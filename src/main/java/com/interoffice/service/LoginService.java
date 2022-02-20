package com.interoffice.service;

import com.interoffice.dto.Account;
import org.springframework.stereotype.Service;

/**
 * LoginService.
 *
 */
@Service
public interface LoginService {

  Account signIn();

}
