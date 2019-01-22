package com.epam.springbootjspexample.interceptor;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.service.Impl.SessionUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInterceptor implements HandlerInterceptor {

    @Autowired
    private SessionUserServiceImpl sessionUserService;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        User currentUser = sessionUserService.getCurrentSessionUser();
    }
}
