package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {
    @Autowired
            @Qualifier("bad")
    Message message;

    @Autowired
            @Qualifier("nice")
    Message message2;

    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        message.printMessage();
        message2.printMessage();
    }

}
