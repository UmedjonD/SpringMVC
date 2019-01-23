package com.epam.springbootjspexample.interceptor;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.enums.Role;
import com.epam.springbootjspexample.service.SessionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    SessionUserService sessionUserService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        User foundUser = sessionUserService.getCurrentSessionUser();
         if (foundUser != null && foundUser.getRole().equals(Role.USER)){
             return true;
        }else if (foundUser == null){
            response.sendRedirect("/index");
            return false;
        }
        return true;
    }
}
