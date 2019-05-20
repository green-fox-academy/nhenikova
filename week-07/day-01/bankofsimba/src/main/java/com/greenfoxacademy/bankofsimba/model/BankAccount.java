package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private boolean king;
    private boolean villain;

    public BankAccount(String name, double balance, String animalType, boolean king, boolean villain) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.villain = villain;
    }

    public BankAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public boolean isVillain() {
        return villain;
    }

    public void setVillain(boolean villain) {
        this.villain = villain;
    }

    public void incrementBalance() {
        if (king) {
            balance += 100;
        } else {
            balance += 10;
        }
    }
}
