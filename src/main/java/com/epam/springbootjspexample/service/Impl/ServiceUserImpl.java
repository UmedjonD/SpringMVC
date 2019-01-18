package com.epam.springbootjspexample.service.Impl;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.repository.RepositoryUser;
import com.epam.springbootjspexample.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUserImpl implements ServiceUser {

    @Autowired
    private RepositoryUser repositoryUser;

    @Override
    public String addUser(User user) {
        return null;
    }

    @Override
    public String removeUser(User user) {
        return null;
    }

    @Override
    public String editUser(User user) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        return repositoryUser.getUserByLogin(login);
    }

}
