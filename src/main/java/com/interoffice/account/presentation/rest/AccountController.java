package com.interoffice.account.presentation.rest;

import com.interoffice.account.application.facade.AccountFacade;
import com.interoffice.account.application.processor.command.AccountCreateCommand;
import com.interoffice.account.application.processor.command.AccountLoginCommand;
import com.interoffice.account.application.processor.data.AccountData;
import com.interoffice.shared.api.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RequestMapping(path = "/account")
@RestController
public class AccountController {

    private final AccountFacade accountFacade;

    public AccountController(AccountFacade accountFacade) {
        this.accountFacade = accountFacade;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/create")
    public ApiResponse<AccountData> createAccount(@RequestBody AccountCreateCommand command) {
        AccountData data = accountFacade.createAccount(command);
        return ApiResponse.success(data);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/login")
    public ApiResponse<AccountData> loginAccount(@RequestBody AccountLoginCommand command, HttpSession session) {
        AccountData data = accountFacade.loginAccount(command);
        session.setAttribute("loginInfo", data);
        session.setMaxInactiveInterval(1800);
        return ApiResponse.success(data);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/logout")
    public ApiResponse<String> logoutAccount(HttpSession session) {
        session.invalidate();
        return ApiResponse.success("로그아웃에 성공하였습니다.");
    }

}
