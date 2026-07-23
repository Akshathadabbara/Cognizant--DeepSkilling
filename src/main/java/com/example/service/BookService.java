package com.example.service;

import com.example.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository = new BookRepository();

    public void addBook(String title) {
        bookRepository.saveBook(title);
    }
}