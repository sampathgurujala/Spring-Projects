package com.sampath.SpringMvcWebApp.controller;


import com.sampath.SpringMvcWebApp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {


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
      
        mv.setViewName("welcomeuser");
        mv.addObject("user",user);
        return "welcomeuser";
    }

}
