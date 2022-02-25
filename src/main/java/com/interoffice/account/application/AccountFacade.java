package com.interoffice.account.application;

import com.interoffice.account.domain.Account;
import com.interoffice.account.domain.AccountRepository;
import com.interoffice.account.presentation.LoginAccountCommand;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * temp.
 */
@Service
@RequiredArgsConstructor
public class AccountFacade {

  private final AccountRepository accountRepository;

  public String logout(HttpSession session) {
    session.removeAttribute("username");
    return "로그아웃 성공";
  }

  /** temp.
   *
   */
  public String login(HttpSession session, LoginAccountCommand loginAccountCommand) {

    if (session.getAttribute("username") != null) {
      return "이미 로그인 상태";
    } else {
      Account account = accountRepository.findByEmail(loginAccountCommand.getEmail()).orElseThrow(
          () -> new NullPointerException("존재하지 않는 이메일")
      );
      session.setAttribute("username", account.getUsername());
      return "로그인 성공";
    }
  }

}


