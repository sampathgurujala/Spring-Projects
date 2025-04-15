package com.sampath.SpringBootWebApp.controller;

import com.sampath.SpringBootWebApp.dao.UserRepository;
import com.sampath.SpringBootWebApp.model.Users;
import com.sampath.SpringBootWebApp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UsersService service;

    @RequestMapping("register")
    public String newUser(Model model)
    {
        System.out.println("register method");
        model.addAttribute("user",new Users());
        return "newuser";
    }

    @PostMapping("addUser")
    public String addUser(@ModelAttribute("user") Users user, ModelAndView mv)
    {
        service.addUser(user);
        mv.setViewName("welcomeuser");
        mv.addObject("user",user);
        return "welcomeuser";
    }

}
