package com.epam.springbootjspexample.controllers;

import com.epam.springbootjspexample.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserController {

    @PostMapping("/login")
    public String checkLoginandPassword(HttpServletRequest req) throws IOException, ServletException {
        String login = req.getParameter("firstname");
        String password = req.getParameter("password");
        String res="";
        if (login.equals("user") && password.equals("123")) {
            req.setAttribute("user",login);
            res = "productCategory";
        } else if ((login.equals("admin") && password.equals("1234"))){
            req.setAttribute("user",login);
            res = "productCategoryAdmin";
        }
        return res;
    }
}
