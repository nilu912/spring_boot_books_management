package com.example.books_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String isbn, author, title;
    private Double price;
    private Integer stockQuantity;

//    Book() {}
//    Book(String isbn, String author, String title, Double price, Integer stockQuantity) {
//        this.isbn = isbn;
//        this.author = author;
//        this.title = title;
//        this.price = price;
//        this.stockQuantity = stockQuantity;
//    }
//
//    public String getISBN() { return this.isbn; }
//    public void setISBN(String isbn) { this.isbn = isbn; }
//
//    public String getAuthor() { return this.author; }
//    public void setAuthor(String author) { this.author = this.author; }
//
//    public String getTitle() { return this.title; }
//    public void setTitle(String title) { this.title = title; }
//
//    public Double getPrice() { return this.price; }
//    public void setPrice(Double price) { this.price = price; }
//
//    public Integer getStockQuantity() { return this.stockQuantity; }
//    public void setStockQuantity(Integer stockQuantity) { this.stockQuantity = stockQuantity; }

}
