package com.own.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 *  实体类
 *
 * @author Mars
 * @since 2023-05-24
 */
@Document("OWN_CUSTOMER")
public class Customer {

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 创建日期
     */
    private Date createTs;

    /**
     * 更新日期
     */
    private Date updateTs;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "account=" + account +
        ", password=" + password +
        ", name=" + name +
        ", age=" + age +
        ", createTs=" + createTs +
        ", updateTs=" + updateTs +
        "}";
    }
}
