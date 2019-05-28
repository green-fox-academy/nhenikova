package com.greenfoxacademy.todoapp.Repository;

import com.greenfoxacademy.todoapp.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}