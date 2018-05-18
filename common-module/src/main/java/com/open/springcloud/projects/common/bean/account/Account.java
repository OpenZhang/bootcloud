package com.open.springcloud.projects.common.bean.account;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Account {

    @Id
    private String id;

    @Column(name = "name")
    @NotBlank(message = "用户名不能为空")
    private String name;

    @Column(name = "password")
    @NotBlank(message = "密码不能为空")
    private String password;

}
