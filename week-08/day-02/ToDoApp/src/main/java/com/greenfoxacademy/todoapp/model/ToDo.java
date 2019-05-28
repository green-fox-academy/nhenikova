package com.greenfoxacademy.todoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public ToDo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }

    public ToDo() {
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isUrgent=" + isUrgent +
                ", isDone=" + isDone +
                '}';
    }
}
