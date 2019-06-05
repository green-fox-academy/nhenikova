package com.greenfoxacademy.orientationexample.controllers;

import com.greenfoxacademy.orientationexample.models.Link;
import com.greenfoxacademy.orientationexample.services.AliasingService;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class LinkApiController {

    private AliasingService aliasingService;

    public LinkApiController(AliasingService aliasingService) {
        this.aliasingService = aliasingService;
    }

    @GetMapping("/api/links")
    public Iterable<Link> getLinks() {
        return aliasingService.getEveryLink();
    }

    @DeleteMapping("/api/links/{id}")
    public ResponseEntity delete(@PathVariable long id, @RequestBody SecretCodeInput secretCodeInput) {
        try {
            aliasingService.deleteLink(id, secretCodeInput.secretCode);
        } catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        return ResponseEntity.noContent().build();
    }

    static class SecretCodeInput {
        public String secretCode;
    }
}