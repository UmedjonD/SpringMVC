package com.epam.springbootjspexample.controllers;

import com.epam.springbootjspexample.dto.User;
import com.epam.springbootjspexample.enums.Role;
import com.epam.springbootjspexample.service.Impl.SessionUserServiceImpl;
import com.epam.springbootjspexample.service.ServiceProduct;
import com.epam.springbootjspexample.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private ServiceUser serviceUser;
    @Autowired
    private ServiceProduct serviceProduct;

    @PostMapping("/login")
    public String checkUserLogin(User user) {
        String res = "registration";
        User foundUser = serviceUser.getUserByLogin(user.getLogin());
        if (foundUser.getPassword().equals(user.getPassword())){
            if (foundUser.getRole().equals(Role.USER)){
                res = "redirect:productCategory";
            }
            if (foundUser.getRole().equals(Role.ADMIN)){
                res = "redirect:productCategoryAdmin";
            }
        }
        return res;
    }

    @GetMapping
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("productCategory");
        modelAndView.addObject("Products", serviceProduct.getlistProducts());
        return modelAndView;
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
