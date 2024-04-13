package com.example.demoapp.service;

import com.example.demoapp.model.Book;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(int id);

    List<Book> sortByYear();

    List <Book> getBookByName(String name);

    List<Book> getBookByYear(int yearStart, int yearEnd);
}
