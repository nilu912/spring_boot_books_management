package com.example.books_management.controllers;

import com.example.books_management.commonUtils.CommonResponseBean;
import com.example.books_management.model.Book;
import com.example.books_management.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BooksManagementController {

    @Autowired
    BookService bookService;

    @PostMapping("/addbook")
    public CommonResponseBean crateNewBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PostMapping("/getbook")
    public CommonResponseBean getBook(@RequestBody Book book) {
        return bookService.getBook(book);
    }

}
