package com.example.demoapp.dao.impl;

import com.example.demoapp.dao.BookDAO;
import com.example.demoapp.database.BookDB;
import com.example.demoapp.model.Book;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {
    @Override
    public List<Book> findAll() {
        return BookDB.books;
    }

    @Override
    public Book findById(int id) {
        for (Book book : BookDB.books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> sortByYear() {
        List<Book> sortedBooks = new ArrayList<>(books);

        int n = sortedBooks.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedBooks.get(j).getYear() > sortedBooks.get(j + 1).getYear()) {
                    Book temp = sortedBooks.get(j);
                    sortedBooks.set(j, sortedBooks.get(j + 1));
                    sortedBooks.set(j + 1, temp);
                }
            }
        }
        return sortedBooks;
    }

    @Override
    public List<Book> getBookByName(String name) {
        List<Book> getByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(name) || book.getTitle().matches(name)) {
                getByName.add(book);
            }
        }
        return getByName;
    }

    @Override
    public List<Book> getBookByYear(int yearStart, int yearEnd) {
        List<Book> getByYear =new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= yearStart && book.getYear() <= yearEnd) {
                getByYear.add(book);
            }
        }
        return getByYear;
    }
}
