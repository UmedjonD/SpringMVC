package com.epam.springbootjspexample.controllers;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.enums.Role;
import com.epam.springbootjspexample.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private ServiceUser serviceUser;

    @PostMapping("/login")
    public String checkUserLogin(User user) {
        String res = "registration";
        User foundUser = serviceUser.getUserByLogin(user.getLogin());
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
        System.out.println(foundUser.getPassword());
        System.out.println(foundUser.getLogin());

        if (foundUser.getPassword().equals(user.getPassword())){
            if (foundUser.getRole().equals(Role.USER)){
                res = "productCategory";
            }
            if (foundUser.getRole().equals(Role.ADMIN)){
                res = "productCategoryAdmin";
            }
        }
        return res;
    }
}
