package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellorRESTController {
    @RequestMapping(value="/greeting", produces="application/json")
    public Greeting handleGreeting(@RequestParam String name){
        return new Greeting("Hello, " + name);
    }
}
