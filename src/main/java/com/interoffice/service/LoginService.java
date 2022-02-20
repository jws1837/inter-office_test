package com.interoffice.service;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * LoginService.
 *
 */
@Service
public interface LoginService {


  /**
   * 로그인 함수.
   *
   */
  String login(HttpSession session, String id, String password);

  void logout(HttpSession session);



}
