package com.epam.springbootjspexample.controllers;

import com.epam.springbootjspexample.enums.Role;
import com.epam.springbootjspexample.service.ServiceProduct;
import com.epam.springbootjspexample.service.SessionUserService;
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
    private ServiceProduct serviceProduct;

    @Autowired
    private SessionUserService sessionUserService;

    @GetMapping(value = {"/","/index","login"})
    public String welcome() {
        return "index";
    }

    @GetMapping("/registration")
    public String welcome3() {
        return "registration";
    }

    @GetMapping("/productCategory")
    public ModelAndView welcome4(ModelAndView modelAndView) {
        modelAndView = new ModelAndView("productCategory");
        modelAndView.addObject("Products", serviceProduct.getlistProducts());
        return modelAndView;
    }
    @GetMapping("/productCategoryAdmin")
    public ModelAndView welcome5(ModelAndView modelAndView) {
    modelAndView = new ModelAndView("productCategoryAdmin");
        modelAndView.addObject("Products", serviceProduct.getlistProducts());
        return modelAndView;
    }
//    @GetMapping("/productCategoryAdmin")
//    public ModelAndView welcome6(SessionUserService sessionUserService) {
//
//    }

}
