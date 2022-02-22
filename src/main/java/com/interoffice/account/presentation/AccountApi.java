package com.interoffice.account.presentation;

import com.interoffice.account.application.AccountFacade;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** temp.
 *
 */
@RestController
@RequiredArgsConstructor
public class AccountApi {

  private final AccountFacade accountFacade;

  @PostMapping(value = "/login")
  public String login(@RequestParam String email, @RequestParam String password, HttpSession session) {
    return accountFacade.login(session, new LoginAccountCommand(email, password));
  }

  @PostMapping(value = "/logout")
  public String logout(HttpSession session) {
    return accountFacade.logout(session);
  }

}
