package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostponedController {
    @GetMapping("/postponed")
    public String mainPage(Model model){
        return "postponed";
    }
}
