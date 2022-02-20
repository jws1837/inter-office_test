package com.interoffice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.interoffice.service.LoginService;

@RestController
public class LoginController {
  @Autowired
  private LoginService service;



  /**
   * @param id
   * @param password
   * @param model
   * @return "success" - 로그인 성공
   * @return "fail" - 로그인 실패
   * 
   */
  @RequestMapping(value = "/member/Login", method = {RequestMethod.GET})
  public String sign(@RequestParam String id, @RequestParam int password, Model model) {

    service.signIn();

    return "success";

  }

}
