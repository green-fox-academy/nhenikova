package com.greenfoxacademy.bookstore.controllers;

import com.greenfoxacademy.bookstore.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookController {

    private List<Book> booklist = new ArrayList<>();

    public BookController() {
        booklist.add(new Book("Title1", "Author1", 1963));
        booklist.add(new Book("Title2", "Author2", 1968));
    }

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public String showBooks(Model model) {
        model.addAttribute("firstBook", booklist.get(0));
        model.addAttribute("books", booklist);
        return "index";
    }

    @RequestMapping(path = "/booksby", method = RequestMethod.GET)
    public String queryBooks(Model model, @RequestParam(name = "author", required = false) String author) {

        List<Book> queriedBooks;

        if (author != null) {
            queriedBooks = filterBooksByAuthor(author);
        } else {
            queriedBooks = booklist;
        }

        model.addAttribute("firstBook", booklist.get(0));
        model.addAttribute("books", booklist);
        return "index";
    }

    private List<Book> filterBooksByAuthor(String author) {
        return booklist.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
}