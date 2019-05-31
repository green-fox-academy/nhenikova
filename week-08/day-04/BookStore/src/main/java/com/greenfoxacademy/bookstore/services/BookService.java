package com.greenfoxacademy.bookstore.services;

import com.greenfoxacademy.bookstore.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private List<Book> booklist = new ArrayList<>();

    public BookService () {
        booklist.add(new Book("Title1", "Author1", 1963));
        booklist.add(new Book("Title2", "Author2", 1968));
    }

    public List<Book> getBooklist() {
        return booklist;
    }

    private List<Book> filterBooksByAuthor(String author) {
        return booklist.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> buildFilterBooks(String author) {
        List<Book> queriedBooks;

        if (author != null) {
            queriedBooks = filterBooksByAuthor(author);
        } else {
            queriedBooks = booklist;
        }
        return queriedBooks;
    }
}
