package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentsController {
    @GetMapping("/documents")
    public String mainPage(Model model){
        return "/documents/index";
    }
}
