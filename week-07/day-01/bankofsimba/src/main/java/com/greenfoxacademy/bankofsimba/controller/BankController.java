package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankController> bankAccounts;

    public BankController() {
        this.bankAccounts = new ArrayList<>();
        //bankAccounts.add(new BankAccount("Simba", 2000.00, "lion"));
        bankAccounts.add(new BankAccount("", 2000.00, "zebra"));
    }

    @GetMapping ("/show")
    public String show(Model model) {
        BankAccount simba = new BankAccount("Simba", 2000.00, "lion");
        model.addAttribute("account", simba);
        return "show";
    }
}
