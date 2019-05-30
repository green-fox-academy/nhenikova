package com.greenfoxacademy.todoapp.controller;


import com.greenfoxacademy.todoapp.model.ToDo;
import com.greenfoxacademy.todoapp.repository.ToDoRepository;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class ToDoController {
    private ToDoRepository repo;

    @Autowired
    public ToDoController(ToDoRepository repo) {
        this.repo = repo;
        this.repo.save(new ToDo("I have to learn Object Relational Mapping", true, true ));
        this.repo.save(new ToDo("Start the day", true, true));
        this.repo.save(new ToDo("Finish H2 workshop 1", true, false));
        this.repo.save(new ToDo("Finish JPA workshop 2", false, false));
        this.repo.save(new ToDo("Create a CRUD project", true, false));
    }

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }


    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("todo", new ToDo());
        return "addform";
    }

    @PostMapping("/add")
    public String addTodo(@RequestParam String title, @RequestParam(value = "isUrgent", defaultValue = "false") boolean urgent, @RequestParam(value = "isDone", defaultValue = "false") boolean done) {
        this.repo.save(new ToDo(title, urgent, done));
        return "redirect:/todo";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable("id") long id) {
        this.repo.deleteById(id);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/edit")
    public String editTodo(@PathVariable("id") long id, Model model) {
        model.addAttribute("todo", repo.findById(id).get())
        return "redirect:/todo";
    }

    @PostMapping("/{id}/edit")
    public String eTodo(@PathVariable("id") long id) {
        this.repo.save()
        return "redirect:/todo";
    }

//    @GetMapping("/seed")
//    public String seed() {
//        this.repo.save(new ToDo("I have to learn Object Relational Mapping", true, true ));
//        this.repo.save(new ToDo("Start the day", true, true));
//        this.repo.save(new ToDo("Finish H2 workshop 1", true, false));
//        this.repo.save(new ToDo("Finish JPA workshop 2", false, false));
//        this.repo.save(new ToDo("Create a CRUD project", true, false));
//        return "todolist";
//    }

}