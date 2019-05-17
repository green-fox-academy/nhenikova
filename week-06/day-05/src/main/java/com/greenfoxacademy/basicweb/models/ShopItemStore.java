package com.greenfoxacademy.basicweb.models;

import java.util.ArrayList;
import java.util.List;

public class ShopItemStore {
    private List<ShopItem> items;

    public ShopItemStore() {
        items = new ArrayList<>();
    }

    public void addItem(ShopItem item) {
        items.add(item);
    }

    public List<ShopItem> getItems() {
        return items;
    }


}
