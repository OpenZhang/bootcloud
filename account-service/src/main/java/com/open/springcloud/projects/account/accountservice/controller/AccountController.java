package com.open.springcloud.projects.account.accountservice.controller;

import com.open.springcloud.projects.account.accountservice.service.AccountService;
import com.open.springcloud.projects.common.bean.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acc")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/create")
    public void createAccount(@RequestBody @Validated Account account, BindingResult result){
        if(result.hasErrors()){
            for (ObjectError error : result.getAllErrors()){
                System.out.println(error.getDefaultMessage());
            }
        }
    }

}
