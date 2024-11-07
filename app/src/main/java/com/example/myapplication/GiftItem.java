package com.example.myapplication;

public class GiftItem {
    private String name;
    private String description;
    private double price;

    public GiftItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
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
}
