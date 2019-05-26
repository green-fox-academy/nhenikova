package com.greenfoxacademy.programmerfoxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String displayFox (String str, Model model) {
        model.addAttribute("home", "Iam Mr. Fox." );
        return "index";
    }

    @GetMapping("/login")
    public String loginGet() {
        return  "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name)

}
