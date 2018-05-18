package com.open.springcloud.projects.account.accountservice.repository;

import com.open.springcloud.projects.common.bean.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long>{
    Account findAccountByName(String name);

    Account findAccountById(String id);

    boolean deleteAccountById(String id);

}
