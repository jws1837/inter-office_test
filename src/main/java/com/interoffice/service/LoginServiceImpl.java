package com.interoffice.service;

import com.interoffice.dao.AccountDao;
import com.interoffice.dto.Account;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * 로그인 구현체.
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
  @Autowired
  private AccountDao dao;



  /**
   * 로그인 함수.
   */

  @Override
  public void logout(HttpSession session) {
    session.removeAttribute("id");
  }

  @Override
  public String login(HttpSession session, String id, String password) {
    String result = "";
    if (session.getAttribute("id") != null) {
      result = "이미로그인상태";
    } else {
      Account account = dao.getAccount(id, password);

      session.setAttribute("id", account.getId());
      result = "로그인성공";
    }
    return result;
  }

}


