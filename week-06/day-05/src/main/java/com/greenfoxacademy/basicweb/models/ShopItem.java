package com.greenfoxacademy.basicweb.models;

public class ShopItem implements Comparable<ShopItem> {
    private String name;
    private String description;
    private double price;
    private int quantityOfStock;

    public ShopItem(String name, String description, double price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public ShopItem() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void addDescription(String description) {
        this.description = description;
    }

    public void addToStock(int quantity) {
        this.quantityOfStock += quantity;
    }

    public int compareTo(ShopItem otherItem) {
        if(this.price < otherItem.price) {
            return -1;
        } else if (this.price > otherItem.price) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "" + this.name + " " + this.description + " " + this.price + " " + this.quantityOfStock;
    }
}



