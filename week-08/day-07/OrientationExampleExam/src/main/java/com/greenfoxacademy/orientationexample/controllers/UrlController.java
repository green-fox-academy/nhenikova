package com.greenfoxacademy.orientationexample.controllers;

import com.greenfoxacademy.orientationexample.models.UrlAlias;
import com.greenfoxacademy.orientationexample.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UrlController {

    UrlService service;

    @Autowired
    public  UrlController(UrlService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String renderRoot(Model model) {
        model.addAttribute("urlAlias", service.getItemToDisplay()); //to display for error still the same, or in case of success to display an empty object
        model.addAttribute("message", service.getMessage()); //the same as save link, but empty message
        model.addAttribute("stored", false);
        return "index";
    }

    @PostMapping("/save-link")
    public String renderSaveLink(Model model, @ModelAttribute UrlAlias urlAlias){ //object has a condition, it will be mapped to the fields of object
      boolean isStored = service.isAlreadyStored(urlAlias.getAlias());
       if(isStored) {
           service.setItemToDisplay(urlAlias); //set to the one from the parameter which was received
           model.addAttribute("message", "Your alias is already in use!");
           model.addAttribute("urlAlias", urlAlias);
           model.addAttribute("stored", true);
       } else {
           String message = "Your URL is aliased to " + urlAlias.getAlias() + " and your secret code is " + urlAlias.getSecretCode() + " .";
           service.setItemToDisplay(new UrlAlias());
           service.save(urlAlias);
           model.addAttribute("message", message);
           model.addAttribute("urlAlias", new UrlAlias());
           model.addAttribute("stored", false);
       }
        return "redirect:/";
    }
}
