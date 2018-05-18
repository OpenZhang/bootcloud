package com.open.springcloud.projects.account.accountservice.service.impl;

import com.open.springcloud.projects.account.accountservice.repository.AccountRepository;
import com.open.springcloud.projects.account.accountservice.service.AccountService;
import com.open.springcloud.projects.common.bean.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account create(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public boolean deleteAccountById(String id) {
        return  accountRepository.deleteAccountById(id);
    }

//    @Override
//    public Integer getAllAccount() {
//        return accountRepository.fin;
//    }
//
//    @Override
//    public void deleteAllAccount() {
//
//    }
}
