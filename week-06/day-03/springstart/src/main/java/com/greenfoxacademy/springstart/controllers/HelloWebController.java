package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        Greeting greetModel = new Greeting("");
        model.addAttribute("name", name);
        model.addAttribute("counter", greetModel.getId());
        return "greeting";
    }
}
