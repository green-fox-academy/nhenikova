package com.greenfoxacademy.tokenauthentication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class HelloRestController {

    @GetMapping("/all")
    public String hello() {
        return "Hello all";
    }

    @GetMapping("/secured/all")
    public String securedHello() {
        return "Secured Hello";
    }
}
