package com.sampath.SpringBootWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        System.out.println("controller called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, ModelAndView mv)
    {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));

       // model.addAttribute("result", num1+num2);
        mv.addObject("result", num1+num2);
        mv.setViewName("result");
        return mv;
    }
}
