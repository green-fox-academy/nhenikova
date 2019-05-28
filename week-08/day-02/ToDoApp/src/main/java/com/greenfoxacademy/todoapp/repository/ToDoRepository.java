package com.greenfoxacademy.todoapp.repository;

import com.greenfoxacademy.todoapp.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}