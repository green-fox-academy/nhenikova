package com.greenfoxacademy.playingaroundwithcolors.model;

import com.greenfoxacademy.playingaroundwithcolors.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor {

    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("It is a red color here...");
    }
}
