package com.greenfoxacademy.orientationexample.services;

import com.greenfoxacademy.orientationexample.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    UrlRepository repo;

    @Autowired
    public  UrlService(UrlRepository repo) {
        this.repo = repo;
    }

    public boolean isAlreadyStored(String alies) {

    }
}
