package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import com.greenfoxacademy.webshop.models.ShopItemStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {
    ShopItemStore myStore = new ShopItemStore();

    public ShopController() {
        myStore.addItem(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        myStore.addItem(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
        myStore.addItem(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
        myStore.addItem(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
        myStore.addItem(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
    }

    @RequestMapping ("/")
    public String show(Model model) {
        model.addAttribute("item", myStore.getItemList());
        return "myStore";
    }

    @RequestMapping ("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("availableitem", myStore.sortAvailable());
        return "myStore";
    }

    @RequestMapping ("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("cheapestitem", myStore.sortCheapFirst());
        return "myStore";
    }

    @RequestMapping ("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("itemnike", myStore.containsKeyword("Nike"));
        return "myStore";
    }

    @RequestMapping ("/average-stock")
    public String averageStock(Model model) {
        double stock = myStore.getAverageStock();
        String result = "Average stock: " + stock;
        model.addAttribute("averagestock", myStore.equals(result));
        return "myStore";
    }

    @RequestMapping
    public String 
}
