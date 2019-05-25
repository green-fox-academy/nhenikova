package com.greenfoxacademy.basicweb.controllers;

import com.greenfoxacademy.basicweb.models.ShopItem;
import com.greenfoxacademy.basicweb.models.ShopItemStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ShopController {
    ShopItemStore myStore = new ShopItemStore();

    public ShopController() {
        myStore.addItem(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0d, 5));
        myStore.addItem(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0d, 2));
        myStore.addItem(new ShopItem("Coca cola", "0.5l standard coke", 25.0d, 0));
        myStore.addItem(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0d, 100));
        myStore.addItem(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0d, 1));
    }

    @GetMapping("/web")
    public String show(Model model) {
        model.addAttribute("items", myStore.getItemList());
        return "mystore";
    }

    @GetMapping ("/web/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("items", myStore.sortAvailable());
        return "mystore";
    }

    @GetMapping ("/web/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("items", myStore.sortCheapFirst());
        return "mystore";
    }

    @GetMapping ("/web/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("items", myStore.containsNike());
        return "mystore";
    }

    @GetMapping ("/web/average-stock")
    public String averageStock(Model model) {
        model.addAttribute("avg", myStore.getAverageStock());
        return "avarageresult";
    }

    @GetMapping ("/web/most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("items", myStore.getMostExpensive());
        return "mystore";
    }

    @PostMapping("/web/search")
    public String search(Model model, @RequestParam String searchInput) {
        model.addAttribute("items", myStore.searchItems(searchInput));
        return "mystore";
    }
}
