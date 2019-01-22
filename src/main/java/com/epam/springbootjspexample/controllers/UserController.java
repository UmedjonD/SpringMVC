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

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private ServiceUser serviceUser;

    @Autowired
    private ServiceProduct serviceProduct;

    @Autowired
    private SessionUserServiceImpl sessionUserService;

    @PostMapping("/login")
    public String checkUserLogin(User user) {
        String res = "";
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
        modelAndView.addObject("Products", serviceProduct.getListProducts());//.getProductById());
        return modelAndView;
    }

//    @PostMapping("/login")
//    public String checkUserLogin2 (User user) {
//        User foundUser = serviceUser.getUserByLogin(user.getLogin());
//
//        if (foundUser == null) {
//            return "error";
//        }
//        sessionUserService.setCurrentSessionUser(foundUser);
//        foundUser.getRole().equals(Role.USER);
//        return "redirect:/productCategory";
//    }

//    @PostMapping("/login")
//    public String checkUserLogin3 (User user) {
//        User foundUser = serviceUser.getUserByLogin(user.getLogin());
//
//        if (foundUser == null) {
//            return "error";
//        }
//        sessionUserService.setCurrentSessionUser(foundUser);
//        foundUser.getRole().equals(Role.ADMIN);
//        return "redirect:/productCategoryAdmin";
//    }
    @GetMapping("/registration")
    public ModelAndView registration(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registration");
        modelAndView.addObject("error", "");
        return modelAndView;
    }
}
