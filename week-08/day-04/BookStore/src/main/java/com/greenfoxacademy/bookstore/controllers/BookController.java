package com.greenfoxacademy.bookstore.controllers;

import com.greenfoxacademy.bookstore.models.Book;
import com.greenfoxacademy.bookstore.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
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

    BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public String showBooks(Model model) {

        List<Book> allBooks = service.getBooklist();
        model.addAttribute("firstBook", allBooks.get(0));
        model.addAttribute("books", allBooks);
        return "index";
    }

    @RequestMapping(path = "/booksby", method = RequestMethod.GET)
    public String queryBooks(Model model, @RequestParam(name = "author", required = false) String author) {

        model.addAttribute("firstBook", service.getBooklist().get(0));
        model.addAttribute("books", service.buildFilterBooks(author));
        return "index";
    }

    @RequestMapping(path = "/booksby2", method = RequestMethod.GET)
    public String queryBooksTwo() {
        return "one";
    }

    @RequestMapping(path = "/booksby", method = RequestMethod.POST)
    public String queryBooksForm(Model model, @RequestParam(name = "author") String author) {
        model.addAttribute("firstBook", service.getBooklist().get(0));
        model.addAttribute("books", service.buildFilterBooks(author));
        return "index";
    }

}