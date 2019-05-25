package com.greenfoxacademy.basicweb.models;

import java.util.ArrayList;
import java.util.Comparator;
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
        List<ShopItem> cheapItem = itemList.stream()
                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
                .collect(Collectors.toList());
        return cheapItem;
    }

    public List<ShopItem> containsNike() {
        return itemList.stream()
                .filter(item -> item.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }

    public List<ShopItem> searchItems(String searchInput) {
        return itemList.stream()
                .filter(item -> item.getName().toLowerCase().contains(searchInput.toLowerCase())
                        || item.getDescription().toLowerCase().contains(searchInput.toLowerCase()))
                .collect(Collectors.toList());
    }

    public double getAverageStock() {
        return itemList.stream()
                .mapToDouble(item -> item.getQuantityOfStock())
                .average()
                .getAsDouble();
    }

    public List<ShopItem> getMostExpensive() {
        Comparator<ShopItem> comparator = Comparator.comparing(ShopItem::getPrice);
        List<ShopItem> expensiveItem = new ArrayList<>();

        ShopItem expensive =  itemList.stream()
                .max(comparator)
                .get();
        expensiveItem.add(expensive);
        return expensiveItem;
    }
}
