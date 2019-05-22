package com.greenfoxacademy.hellobeanworld.model;

import com.greenfoxacademy.hellobeanworld.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bad")
public class BadMessage implements Message {
    @Autowired
    Printer printer;

    public void printMessage() {
     printer.log("Iam a bad message and I really hate you... Go fuck up...!");
    }
}
