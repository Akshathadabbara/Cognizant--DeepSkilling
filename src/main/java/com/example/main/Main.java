package com.example.main;

import com.example.service.BookService;

public class Main {

    public static void main(String[] args) {
        BookService service = new BookService();
        service.addBook("Java Programming");
    }
}