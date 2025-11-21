package com.example.controller;

import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private BookService bookService;
    @GetMapping("/")
    public String home(){
        return "Welcome to the book API";

    }
    @GetMapping("/findbyid/{id}")
    public Book findBookById(@PathVariable int id){
        return bookService.findBookById(id);

    }
    @GetMapping("/findall")
    public List<Book>findAllBooks(){
        return bookService.findAllBooks();
    }
    @GetMapping("/deleteallbooks")
    public String deleteAllBooks(){
        bookService.deleteAllBooks();
        return "All books are deleted";

    }

}
