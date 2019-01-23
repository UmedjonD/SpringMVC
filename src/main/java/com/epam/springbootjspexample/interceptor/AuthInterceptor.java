package com.epam.springbootjspexample.interceptor;


import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.service.Impl.SessionUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Reader;
import java.util.Objects;

public class AuthInterceptor implements HandlerInterceptor {

    @Autowired
    private SessionUserServiceImpl sessionUserService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        User user = sessionUserService.getCurrentSessionUser();

        if (Objects.isNull(user)) {
            response.sendRedirect("/index");
            return false;
        }

        return true;
    }

}
