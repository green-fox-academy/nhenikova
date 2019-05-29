package com.greenfoxacademy.todoapp;

import com.greenfoxacademy.todoapp.model.ToDo;
import com.greenfoxacademy.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication {
    private ToDoRepository repo;

    @Autowired
    TodoappApplication(ToDoRepository repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }
}

