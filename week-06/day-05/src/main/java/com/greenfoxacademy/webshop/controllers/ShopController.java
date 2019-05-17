package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItemStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {
    ShopItemStore shopItemStore = new ShopItemStore();

    @RequestMapping ("/web")
    public String showList(Model model) {
        model.addAttribute("item", shopItemStore.getItemList());
        return "webshop";
    }
}
