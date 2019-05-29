package com.greenfoxacademy.todoapp.controller;


import com.greenfoxacademy.todoapp.model.ToDo;
import com.greenfoxacademy.todoapp.repository.ToDoRepository;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class ToDoController {
    private ToDoRepository repo;

    @Autowired
    public ToDoController(ToDoRepository repo) {
        this.repo = repo;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }

    @GetMapping("/seed")
    public String seed() {
        this.repo.save(new ToDo("I have to learn Object Relational Mapping", true, true ));
        this.repo.save(new ToDo("Start the day", true, true));
        this.repo.save(new ToDo("Finish H2 workshop 1", true, false));
        this.repo.save(new ToDo("Finish JPA workshop 2", false, false));
        this.repo.save(new ToDo("Create a CRUD project", true, false));
        return "todolist";
    }

}