package com.greenfoxacademy.orientationexample.controllers;

import com.greenfoxacademy.orientationexample.models.Link;
import com.greenfoxacademy.orientationexample.services.AliasingService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LinkController {

    private AliasingService aliasingService;

    public LinkController(AliasingService aliasingService) {
        this.aliasingService = aliasingService;
    }

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(required = false) String secretCode,
                        @RequestParam(required = false) String alias,
                        @RequestParam(required = false) boolean error,
                        @RequestParam(required = false) String url
    ) {
        model.addAttribute("secretCode", secretCode);
        model.addAttribute("alias", alias);
        model.addAttribute("error", error);
        model.addAttribute("url", url);

        return "index";
    }

    @PostMapping("/save-link")
    public String save(Link link) {
        Link savedLink = null;
        try {
            savedLink = aliasingService.save(link);
        } catch (IllegalArgumentException ex) {
            return "redirect:/?error=true" + "&url=" + link.getUrl() + "&alias=" + link.getAlias();
        }

        return "redirect:/?secretCode=" + savedLink.getSecretCode() + "&alias=" + savedLink.getAlias();
    }

    @GetMapping("/a/{alias}")
    public String redirectToLink(@PathVariable String alias) {
        Link link = aliasingService.findByAlias(alias);

        if (link == null) {
            throw new ResourceNotFoundException();
        }

        return "redirect:" + link.getUrl();
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class ResourceNotFoundException extends RuntimeException {

    }
}