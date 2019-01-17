package com.epam.springbootjspexample.dto;

import com.epam.springbootjspexample.enums.Role;

public class User {
    private String login;
    private int password;
    private Role role;

    public User() {
    }

    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public User(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
