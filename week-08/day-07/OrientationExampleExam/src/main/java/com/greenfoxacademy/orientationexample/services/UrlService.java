package com.greenfoxacademy.orientationexample.services;

import com.greenfoxacademy.orientationexample.models.UrlAlias;
import com.greenfoxacademy.orientationexample.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlService {

    private UrlAlias itemToDisplay;
    private UrlRepository repo;
    private boolean displayMessage;

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

    public boolean isDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(boolean displayMessage) {
        this.displayMessage = displayMessage;
    }

    public String getMessage() {
        if(isDisplayMessage()) {
            return "";
        } else {
            if (isAlreadyStored(itemToDisplay.getAlias())) {
                return "Your alias is already in use!"; //stored
            } else {
                return "Your URL is aliased to " + itemToDisplay.getAlias() + " and your secret code is " + itemToDisplay.getSecretCode() + " .";
                //not stored item, show a message
            }
        }
    }

    public String isStored() {
    }


}
