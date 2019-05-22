package com.greenfoxacademy.playingaroundwithcolors.model;

import com.greenfoxacademy.playingaroundwithcolors.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class GreenColor implements MyColor {

    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("Iam a green color as the color used for the green fox academy...");
    }

}
