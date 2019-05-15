package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private static AtomicLong id = new AtomicLong();
    String content;

    public Greeting(String content) {
        this.id.getAndIncrement();
        this.content = content;
    }

    public AtomicLong getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
