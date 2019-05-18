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

    public List<ShopItem> containsKeyword(String string) {
        return itemList.stream()
                .filter(ShopItem -> ShopItem.getName().toLowerCase().contains(string.toLowerCase())
                || ShopItem.getDescription().toLowerCase().contains(string.toLowerCase()))
                .collect(Collectors.toList());
    }

    public double getAverageStock() {
        double totalAverage = 0;
        for (ShopItem item:itemList) {
            totalAverage = totalAverage + item.getQuantityOfStock();
        }
        return totalAverage/this.itemList.size();
    }

    public String getMostExpensive() {
        return itemList.stream()
                .max(ShopItem::compareTo)
                .get().getName();
    }

//    @Override
//    public String toString() {
//        String result = "";
//        for (ShopItem item : itemList) {
//            result += "ITEM: ";
//            result += item;
//            result += System.lineSeparator();
//        }
//        return result;
//    }
}
