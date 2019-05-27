package com.greenfoxacademy.bankofsimba.model;


import java.util.ArrayList;
import java.util.List;

public class BankAccountStore {
    private List<BankAccount> animalAccounts;

    public BankAccountStore() {
        this.animalAccounts = new ArrayList<>();
        animalAccounts.add(new BankAccount("Simba", 2000.00, "lion", true, false));
        animalAccounts.add(new BankAccount("Marty", 2000.00, "zebra", false, false));
        animalAccounts.add(new BankAccount("Pumba", 1500.00, "warthog", false, false));
        animalAccounts.add(new BankAccount("Timon", 1000.00, "meerkat", false, false));
        animalAccounts.add(new BankAccount("Shaman", 3500.00, "baboon", false, false));
        animalAccounts.add(new BankAccount("Skar", 1500.00, "lion", false, true));
    }

    public List<BankAccount> getAccounts() {
        return animalAccounts;
    }

}
