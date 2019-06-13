package com.hamusuta.hellohamusuta.vo.requestVo;

import io.swagger.annotations.ApiParam;

public class UserVo {

    @ApiParam(value = "账户名",required = true)
    private String account;
    @ApiParam(value = "用户名",required = true)
    private String userName;
    @ApiParam(value = "用户密码",required = true)
    private String password;
    @ApiParam(value = "用户邮箱",required = true)
    private String mail;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
