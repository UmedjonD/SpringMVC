package com.epam.springbootjspexample.service;

import com.epam.springbootjspexample.dto.User;

public interface ServiceUser {

     String addUser(User user);
     String removeUser(User user);
     String editUser(User user);
}
