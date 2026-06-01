package com.example.books_management.serviceImpl;

import com.example.books_management.commonUtils.CommonResponseBean;
import com.example.books_management.commonUtils.NullAndEmpty;
import com.example.books_management.datasource.Data;
import com.example.books_management.model.Book;
import com.example.books_management.model.User;
import com.example.books_management.services.BookService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

//    Map<String, Book> bookStore = new HashMap<>();
//    Map<String, User> users = new HashMap<>();
//    Map<String, Book> boughBook = new HashMap<>();

    public CommonResponseBean addBook(Book book) {
        System.out.println(book);
        if(NullAndEmpty.isNullAndEmpty(book.getIsbn()) || Data.bookStore.get(book.getIsbn()) == null) {
            Data.bookStore.put(book.getIsbn(), book);
            return new CommonResponseBean(true, 200,"", "Book added successfully!");
        } else {
            return new CommonResponseBean(false, 400,"parameter is missing!", null);
        }
//        return new CommonResponseBean(false, 500,"Something wants wrong!", null);
    }

    public CommonResponseBean getBook(Book book) {

        if(NullAndEmpty.isNullAndEmpty(book.getIsbn()) || Data.bookStore.get(book.getIsbn()) != null) {
            return new CommonResponseBean(true, 200, "", Data.bookStore.get(book.getIsbn()));
        }
        return new CommonResponseBean(false, 404,"No book found!", null);
    }
}
