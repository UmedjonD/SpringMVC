package com.epam.springbootjspexample.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "index";
    }
    @GetMapping("/login")
    public String welcome2() {
        return "index";
    }
//    @GetMapping("/")
//    private ModelAndView homeGet(ModelAndView modelAndView) {
//        modelAndView.setViewName("redirect:index");
//        return modelAndView;
//    }
//
//    @PostMapping("/")
//    private ModelAndView homePost(ModelAndView modelAndView) {
//        modelAndView.setViewName("redirect:index");
//        return modelAndView;
//    }
}
