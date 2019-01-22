package com.epam.springbootjspexample.controllers;

import com.epam.springbootjspexample.service.Impl.SessionUserServiceImpl;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class WelcomeController {

    @Autowired
    private SessionUserServiceImpl sessionUserService;

    @GetMapping("/")
    public String welcome() {
        return "index";
    }
    @GetMapping("/login")
    public String welcome2() {
        return "index";
    }

//    @GetMapping("/registration")
//    public String welcome3() {
//        return "registration";
//    }

    @GetMapping("/productCategory")
    public String welcome4() {
        return "productCategory";
    }
    @GetMapping("/productCategoryAdmin")
    public String welcome5() {
        return "productCategoryAdmin";
    }

}
