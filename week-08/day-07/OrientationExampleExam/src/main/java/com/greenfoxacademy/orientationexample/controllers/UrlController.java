package com.greenfoxacademy.orientationexample.controllers;

import com.greenfoxacademy.orientationexample.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlController {

    UrlService service;

    @Autowired
    public  UrlController(UrlService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String renderRoot() {
        return "index";
    }

    @GetMapping("/save-link")
    public String renderSaveLink(){
      boolean isStored = service.isAlreadyStored(alias);
       if() {

       } else {

       }
        return "index";
    }
}
