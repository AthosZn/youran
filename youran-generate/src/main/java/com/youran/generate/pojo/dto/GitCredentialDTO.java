package com.youran.generate.pojo.dto;

/**
 * Title: git认证对象
 * Description:
 * Author: cbb
 * Create Time: 2018/3/17 13:36
 */
public class GitCredentialDTO {

    private String username;

    private String password;

    public GitCredentialDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}