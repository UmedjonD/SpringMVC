package com.epam.springbootjspexample.controllers;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.enums.Role;
import com.epam.springbootjspexample.service.Impl.SessionUserServiceImpl;
import com.epam.springbootjspexample.service.ServiceProduct;
import com.epam.springbootjspexample.service.ServiceUser;
import com.epam.springbootjspexample.service.SessionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private ServiceUser serviceUser;
    @Autowired
    private ServiceProduct serviceProduct;
    @Autowired
    private SessionUserService sessionUserService;

    @PostMapping("/login")
    public String checkUserLogin(User user, HttpSession session) {
        String res = "registration";
        User foundUser = serviceUser.getUserByLogin(user.getLogin());
        if (foundUser.getPassword().equals(user.getPassword())){
            sessionUserService.setCurrentSessionUser(foundUser);
            session.setAttribute("user", foundUser);

            if (foundUser.getRole().equals(Role.USER)){
                res = "redirect:productCategory";
            }
            if (foundUser.getRole().equals(Role.ADMIN)){
                res = "redirect:productCategoryAdmin";
            }
        }
        return res;
    }

//    @GetMapping("login")
//    private ModelAndView client(ModelAndView modelAndView) {
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }
//
//    @GetMapping("login/product")
//    private ModelAndView clientbook(ModelAndView modelAndView) {
//        modelAndView.setViewName("productCategory");
//        return modelAndView;
//    }
}
