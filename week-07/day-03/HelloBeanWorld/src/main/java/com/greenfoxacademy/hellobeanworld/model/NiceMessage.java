package com.greenfoxacademy.hellobeanworld.model;


import com.greenfoxacademy.hellobeanworld.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("nice")
public class NiceMessage implements Message {
    @Autowired
    Printer printer;

    public void printMessage() {
        printer.log("Iam a nice message and I wish you a nice day!");
    }
}
