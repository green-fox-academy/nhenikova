package com.greenfoxacademy.orientationexample.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Random;

@Entity
@Table(name= "lovelyAlias")
public class UrlAlias {

    @Id
    private String url;
    private String alias;
    private String secretCode;

    public UrlAlias() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    private void generateSecretCode() {
        String result = ""; //needs to be a String so it will store the whole int
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int value = random.nextInt(10);
            result += value;
        }

        secretCode = result;

        //int min = 1000; - another option, but needs to be stored as String
        //int max = 9999;
        //secretCode = (int) (Math.random() * (max-min) + min;
    }
}
