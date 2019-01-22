package com.epam.springbootjspexample.interceptor;

import com.epam.springbootjspexample.service.Impl.SessionUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminInterceptor {
    @Autowired
    private SessionUserServiceImpl sessionUserService;

}
