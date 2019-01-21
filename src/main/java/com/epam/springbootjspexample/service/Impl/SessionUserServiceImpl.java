package com.epam.springbootjspexample.service.Impl;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.service.SessionUserService;
import org.springframework.stereotype.Service;

@Service
public class SessionUserServiceImpl implements SessionUserService {

    private User currentSessionUser;

    @Override
    public User setCurrentSessionUser(User user) {
        currentSessionUser = user;
        return currentSessionUser;
    }

    @Override
    public User getCurrentSessionUser() {
        return currentSessionUser;
    }
}
