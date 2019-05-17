package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import com.greenfoxacademy.webshop.models.ShopItemStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
        model.addAttribute("item", myStore.sortAvailable());
        return "myStore";
    }

    @RequestMapping ("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("item", myStore.sortCheapFirst());
        return "myStore";
    }

    @RequestMapping ("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("item", myStore.containsKeyword("Nike"));
        return "myStore";
    }

    @RequestMapping ("/average-stock")
    public String averageStock(Model model) {
        double stock = myStore.getAverageStock();
        String result = "Average stock: " + stock;
        model.addAttribute("item", myStore.equals(result));
        return "mySingleStore";
    }

    @RequestMapping ("/most-expensive")
    public String mostExpensive(Model model) {
        String name = myStore.getMostExpensive();
        String result = "THe most expensive item is" + name;
        model.addAttribute("item", myStore.equals(result));
        return "mySingleStore";
    }

    @PostMapping(value="/search")
    public String search(Model model, String input) {
        model.addAttribute("item", myStore.containsKeyword(input));
        return "myStore";
    }

    private void addItemListToModel(Model model, List<ShopItem> list) {
        try {
            model.addAttribute("item", list);
        } catch (NullPointerException eX) {
            System.err.println(eX.getMessage());
            System.out.println(list);
        }
    }
}
