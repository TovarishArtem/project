package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenresController {
    @GetMapping("/genres")
    public String mainPage(Model model){
        return "/genres/index";
    }
}
