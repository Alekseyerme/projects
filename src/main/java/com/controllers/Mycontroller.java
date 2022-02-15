package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {
    @GetMapping("/hello")
    public String helloPage(Model model){
        model.addAttribute("message", "Hello Spring MVC");

        return "helloPage";
    }
}
