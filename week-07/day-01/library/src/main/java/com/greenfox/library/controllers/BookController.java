package com.greenfox.library.controllers;

import com.greenfox.library.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookController {
    private List<Book> library;

    public BookController() {
        library = new ArrayList();
        library.add(new Book( "Cat's Cradle", "Kurt Vonnegut", 1963));
        library.add(new Book( "Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968));
        library.add(new Book( "Wuthering heights", "Emily Bronte", 1847));
    }

    @GetMapping("/books")
    public String showBooks(Model model, @RequestParam(name = "author", required = false) String author) {
        List<Book> booksToList = null;
        if (author != null) {
            booksToList = library.stream()
                    .filter(book -> book.getAuthor().equals(author))
                    .collect(Collectors.toList());
        } else {
            booksToList = library;
        }
        model.addAttribute("books", booksToList);
        return "booklist";
    }

    @GetMapping("/books/{id}/details")
    public String getBookById(Model model, @PathVariable(name = "id") int id) {
        Book selected = null;
        for (Book book : library) {
            if (book.getId() == id) {
                selected = book;
            }
        }
        if (selected != null) {
            model.addAttribute("book", selected);
        } else {
            model.addAttribute("error", "No book found with this id");
        }
        return "bookdetails";
    }

    @GetMapping("/books/add")
    public String addBookForm(Model model, @ModelAttribute(name = "book") Book book) {
        model.addAttribute("book", book);
        return "createbook";
    }

    @PostMapping("/books/add")
    public String addBook(@ModelAttribute(name = "book") Book book) {
        library.add(book);
        return "redirect:/books";
    }

}