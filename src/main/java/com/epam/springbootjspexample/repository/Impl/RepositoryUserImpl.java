package com.epam.springbootjspexample.repository.Impl;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.repository.RepositoryUser;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.epam.springbootjspexample.enums.Role.ADMIN;
import static com.epam.springbootjspexample.enums.Role.USER;

@Repository
public class RepositoryUserImpl implements RepositoryUser {

    List<User> userList = new ArrayList<>();

    public RepositoryUserImpl() {
        User admin = new User("admin", "1234");
        admin.setRole(ADMIN);
        User user = new User("user", "123");
        user.setRole(USER);

        userList.add(admin);
        userList.add(user);
    }


    @Override
    public List<User> getUser() {
        return userList;
    }

    @Override
    public User getUserByLogin(String login) {
        for (User user: userList) {
            if (user.getLogin().equals(login))
                return user;
        }
        return null;
    }
}
