package com.interoffice.controller;

import com.interoffice.service.LoginService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 로그인을 관리하는 컨트롤러입니다.
 */
@RestController
public class LoginController {
  @Autowired
  private LoginService service;



  /**
   * 로그인. 성공 - success 실패 - fail
   */
  @PostMapping(value = "/Login")
  public String login(@RequestParam String id, @RequestParam String password, HttpSession session) {

    String result = service.login(session, id, password);
    return result;

  }

  /**
   * 로그아웃.
   */

  @GetMapping(value = "/Logout")
  public String sign(HttpSession session) {

    service.logout(session);
    return "success";
  }


}
