package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.model.BankAccountStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

   private BankAccountStore accounts = new BankAccountStore();

    @GetMapping ("/show")
    public String show(Model model) {
        BankAccount simba = new BankAccount("Simba", 2000.00, "lion");
        model.addAttribute("account", simba);
        return "show";
    }

    @GetMapping ("/show-table")
    public String showTable(Model model) {
        model.addAttribute("accounts", accounts);
        return "showtable";
    }
}
