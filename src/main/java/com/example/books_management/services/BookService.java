package com.example.books_management.services;
import com.example.books_management.commonUtils.CommonResponseBean;
import com.example.books_management.model.Book;

public interface BookService {
    public CommonResponseBean addBook(Book book);
    public CommonResponseBean getBook(Book book);
}