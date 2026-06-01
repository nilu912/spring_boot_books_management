package com.example.books_management.datasource;

import com.example.books_management.model.Book;
import com.example.books_management.model.User;

import java.util.HashMap;
import java.util.Map;

public class Data {
    public static Integer uid = 1;
    public static Map<String, Book> bookStore = new HashMap<>();
    public static Map<Integer, User> users = new HashMap<>();
    public static Map<String, Book> boughBook = new HashMap<>();
}
