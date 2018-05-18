package com.open.springcloud.projects.account.accountservice.service;


import com.open.springcloud.projects.common.bean.account.Account;

public interface AccountService {
    /**
     * 新增一个用户
     * @param name
     * @param password
     */
    Account create(Account account);

    /**
     * 根据id删除一个用户
     * @param id
     */
    boolean deleteAccountById(String id);

//    /**
//     * 获取用户总量
//     */
//    Integer getAllAccount();
//
//    /**
//     * 删除所有用户
//     */
//    void deleteAllAccount();
}
