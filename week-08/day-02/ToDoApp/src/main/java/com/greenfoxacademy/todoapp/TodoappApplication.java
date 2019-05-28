package com.greenfoxacademy.todoapp;

import com.greenfoxacademy.todoapp.model.ToDo;
import com.greenfoxacademy.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication implements CommandLineRunner {
    private ToDoRepository repo;

    @Autowired
    TodoappApplication(ToDoRepository repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new ToDo("I have to learn Object Relational Mapping", true, true ));
        repo.save(new ToDo("Start the day", true, true));
        repo.save(new ToDo("Finish H2 workshop 1", true, false));
        repo.save(new ToDo("Finish JPA workshop 2", false, false));
        repo.save(new ToDo("Create a CRUD project", true, false));
    }
}

