package com.example.demoapp.database;

import com.example.demoapp.model.Book;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDB {
    public static List<Book> books = new ArrayList<>(
            List.of(
                    new Book(1, "Java Programming", "John Doe", 100),
                    new Book(2, "Python Programming", "Jane Doe", 200),
                    new Book(3, "C Programming", "Alice", 150),
                    new Book(4, "C++ Programming", "Bob", 250),
                    new Book(5, "The Catcher in the Rye", "J.D. Salinger", 1951),
                    new Book(6, "To Kill a Mockingbird", "Harper Lee", 1960),
                    new Book(7, "Animal Farm", "George Orwell", 1945),
                    new Book(8, "The Hobbit", "J.R.R. Tolkien", 1937),
                    new Book(9, "The Lord of the Rings", "J.R.R. Tolkien", 1954),
                    new Book(10, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997)
            )
    );
}
