package com.epam.springbootjspexample.repository;

import com.epam.springbootjspexample.dto.Product;
import com.epam.springbootjspexample.dto.User;

import java.util.LinkedList;
import java.util.List;

public interface RepositoryUser {

    List<User> getUser();

    User getUserByLogin(String login);
}
