package com.epam.springbootjspexample.service.Impl;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.service.SessionUserService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class SessionUserServiceImpl implements SessionUserService {

    private User currentSessionUser;

    @Override
    public void setCurrentSessionUser(User user) {
        this.currentSessionUser = user;
    }

    @Override
    public User getCurrentSessionUser() {
        return currentSessionUser;
    }
}
