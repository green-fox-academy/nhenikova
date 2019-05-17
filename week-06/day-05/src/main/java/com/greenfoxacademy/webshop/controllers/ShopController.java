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

    @RequestMapping ("/")
}
