package com.epam.springbootjspexample.service;
import com.epam.springbootjspexample.dto.User;

public interface SessionUserService {

    User setCurrentSessionUser(User user);

    User getCurrentSessionUser();
}
