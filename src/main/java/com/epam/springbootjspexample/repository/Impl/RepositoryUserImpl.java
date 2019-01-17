package com.epam.springbootjspexample.repository.Impl;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.repository.RepositoryUser;

import java.util.ArrayList;
import java.util.List;

import static com.epam.springbootjspexample.enums.Role.ADMIN;
import static com.epam.springbootjspexample.enums.Role.USER;

public class RepositoryUserImpl implements RepositoryUser {

    List<User> userList = new ArrayList<>();

    @Override
    public void users() {
        User admin = new User("Admin", 1234);
        admin.setRole(ADMIN);
        User user = new User("user", 123);
        admin.setRole(USER);

        userList.add(admin);
        userList.add(user);
    }

    @Override
    public List<User> getUser() {
        return null;
    }
}
