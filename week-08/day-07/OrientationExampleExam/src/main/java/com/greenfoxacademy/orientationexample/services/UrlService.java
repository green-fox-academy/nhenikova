package com.greenfoxacademy.orientationexample.services;

import com.greenfoxacademy.orientationexample.models.UrlAlias;
import com.greenfoxacademy.orientationexample.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlService {

    private UrlAlias itemToDisplay;
    UrlRepository repo;

    @Autowired
    public  UrlService(UrlRepository repo) {
        this.repo = repo;
        this.itemToDisplay = new UrlAlias();
    }

    public boolean isAlreadyStored(String alias) {
//        UrlAlias itemWithTheSameAlias = repo.findByAlias(alias);
//        return itemWithTheSameAlias != null;

        Optional<UrlAlias> itemWithTheSameAlias = repo.getItemByAlias(alias);
        return itemWithTheSameAlias.isPresent(); //check if it present
    }

    public void save (UrlAlias itemToSave) {
        repo.save(itemToSave);
    }

    public UrlAlias getItemToDisplay() {
        return itemToDisplay;
    }

    public void setItemToDisplay(UrlAlias itemToDisplay) {
        this.itemToDisplay = itemToDisplay;
    }
}
