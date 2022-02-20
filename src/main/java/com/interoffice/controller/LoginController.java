package com.interoffice.controller;

import com.interoffice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *로그인을 관리하는 컨트롤러입니다. 
 */
@RestController
public class LoginController {
  @Autowired
  private LoginService service;



  /**
   * 로그인에 해당하는 매핑 메서드.
   * 
   */
  @RequestMapping(value = "/member/Login", method = {RequestMethod.GET})
  public String sign(@RequestParam String id, @RequestParam int password, Model model) {

    service.signIn();

    return "success";

  }

}
