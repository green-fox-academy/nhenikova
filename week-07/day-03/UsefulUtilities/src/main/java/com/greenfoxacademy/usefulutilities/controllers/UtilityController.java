package com.greenfoxacademy.usefulutilities.controllers;

import com.greenfoxacademy.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
    private UtilityService service;

    @Autowired
    public UtilityController(UtilityService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/useful")
    public String usefulUtilities() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", service.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String emailValidator(@RequestParam String email, Model model) {
        if(service.validateEmail(email)) {
            model.addAttribute("email", "<font color=\"green\">" + email + " is valid email address</font>");
        } else {
            model.addAttribute("email", "<font color=\"red\">" + email + " is not valid email address</font>");
        }
        return "email";
    }

    @GetMapping("/useful/caesar")
    public String caesarCode(@RequestParam String text, @RequestParam int number, @RequestParam String substr, Model model) {
        if(substr.equals("encode")) {
            model.addAttribute("text", service.caesar(text, number));
        } else {
            model.addAttribute("text", service.caesar(text, -number));
        }
        return "caesar";
    }
}
