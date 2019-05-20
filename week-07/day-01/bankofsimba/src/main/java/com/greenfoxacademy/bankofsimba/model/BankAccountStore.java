package com.greenfoxacademy.bankofsimba.model;


import java.util.ArrayList;
import java.util.List;

public class BankAccountStore {
    private List<BankAccount> accounts;

    public BankAccountStore() {
        this.accounts = new ArrayList<>();
        accounts.add(new BankAccount("Simba", 2000.00, "lion"));
        accounts.add(new BankAccount("Marty", 2000.00, "zebra"));
        accounts.add(new BankAccount("Pumba", 1500.00, "warthog"));
        accounts.add(new BankAccount("Timon", 1000.00, "meerkat"));
        accounts.add(new BankAccount("Shaman", 3500.00, "baboon"));
        accounts.add(new BankAccount("Skar", 1500.00, "lion"));
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
