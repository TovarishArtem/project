package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Author;
import com.example.MyBookShopApp.data.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BookService;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Map;


@Controller
public class PopularController {

    private final BookService bookService;
    private final  AuthorService authorService;

    public PopularController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @ModelAttribute("booksList")
    public List<Book> bookList() {
        return bookService.getBooksData();
    }

    @GetMapping("/books/popular")
    public String recentBookPage() {
        return "books/popular";
    }
    @ModelAttribute("authorsList")
    public List<Author> authorsMap(){

        return authorService.getAuthorsData();
    }
}
