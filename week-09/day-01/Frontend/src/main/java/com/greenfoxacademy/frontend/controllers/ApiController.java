package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Doubling;
import com.greenfoxacademy.frontend.models.ErrorMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
           return new Doubling(input);
        } else {
        return new ErrorMessage("Please provide an input!");
        }
    }


}
