package com.greenfoxacademy.todoapp.controller;


import com.greenfoxacademy.todoapp.repository.ToDoRepository;
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

}