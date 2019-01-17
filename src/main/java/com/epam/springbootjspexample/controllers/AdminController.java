package com.epam.springbootjspexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {

//    @PostMapping("/admin")
//    public String checkLoginAdmin (HttpServletRequest req) {
//        String login = req.getParameter("firstname");
//        String password = req.getParameter("password");
//
//        if (login.equals("admin") && password.equals("1234")) {
//            req.setAttribute("admin",login);
//        }
//        return "productCategoryAdmin";
//    }
}
