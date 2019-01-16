package com.epam.springbootjspexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {

    @PostMapping
    public void checkLoginandPassword(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String login = req.getParameter("firstname");
        String password = req.getParameter("password");

        if (login.equals("user") && password.equals("1234")) {
            req.setAttribute("user",login);
            req.getRequestDispatcher("jsp/productCategory.jsp").forward(req, resp);
        } else {
            System.out.println("error 1000");
        }
    }
//    @PostMapping("/product")
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        checkLoginandPassword(req, resp);
//    }

}
