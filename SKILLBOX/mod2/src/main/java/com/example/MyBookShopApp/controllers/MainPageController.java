package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller

public class MainPageController {

    private final BookService bookService;

    @Autowired
    public MainPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("bookData", bookService.getBooksData());


        return "index";
    }
    @GetMapping("/authors")
    public String authorsPage(Model model){


        model.addAttribute("authorsData", bookService.getHashMapAuthorByCharData(bookService.getAuthorsData()));


        return "authors/index";
    }
}
