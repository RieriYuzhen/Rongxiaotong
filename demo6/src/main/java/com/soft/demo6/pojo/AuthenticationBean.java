package com.soft.demo6.pojo;

public class AuthenticationBean {
    private String userName;
    private String password;

    private

    public AuthenticationBean(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }
}

