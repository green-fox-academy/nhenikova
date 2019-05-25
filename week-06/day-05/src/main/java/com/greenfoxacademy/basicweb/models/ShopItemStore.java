package com.greenfoxacademy.basicweb.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItemStore {
    private List<ShopItem> itemList;

    public ShopItemStore() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(ShopItem item) {
        itemList.add(item);
    }

    public List<ShopItem> getItemList() {
        return itemList;
    }

    public List<ShopItem> sortAvailable() {
        return itemList.stream()
                .filter(item -> item.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    public List<ShopItem> sortCheapFirst() {
        return itemList.stream()
                .sorted(ShopItem::compareTo)
                .collect(Collectors.toList());
    }

    public List<ShopItem> containsNike() {
        return itemList.stream()
                .filter(item -> item.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }

    public List<ShopItem> searchItems(String searchInput) {
        return itemList.stream()
                .filter(ShopItem -> ShopItem.getName().toLowerCase().contains(searchInput.toLowerCase())
                        || ShopItem.getDescription().toLowerCase().contains(searchInput.toLowerCase()))
                .collect(Collectors.toList());
    }

    public double getAverageStock() {
        return itemList.stream()
                .mapToDouble(item -> item.getQuantityOfStock())
                .average()
                .getAsDouble();
    }

    public String getMostExpensive() {
        return itemList.stream()
                .max(ShopItem::compareTo)
                .get().getName();
    }
}
