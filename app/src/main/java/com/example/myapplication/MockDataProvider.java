package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class MockDataProvider {

    public static List<Subscription> getSubscriptions() {
        List<Subscription> subscriptions = new ArrayList<>();
        subscriptions.add(new Subscription("Annual Subscription", "One-year access to all gym facilities.", 1500));
        subscriptions.add(new Subscription("Monthly Subscription", "One-month access to all gym facilities.", 200));
        return subscriptions;
    }

    public static List<ProteinProduct> getProteinProducts() {
        List<ProteinProduct> proteinProducts = new ArrayList<>();
        proteinProducts.add(new ProteinProduct("Whey Protein", "High-quality whey protein for muscle building.", 44));
        proteinProducts.add(new ProteinProduct("Casein Protein", "Slow-release casein protein for muscle recovery.", 70));
        return proteinProducts;
    }

    public static List<GiftItem> getGiftItems() {
        List<GiftItem> giftItems = new ArrayList<>();
        giftItems.add(new GiftItem("Gym T-Shirt", "Comfortable T-shirt with gym logo.", 15.0));
        giftItems.add(new GiftItem("Gym Shoes", "Durable and lightweight gym shoes.", 50.0));
        giftItems.add(new GiftItem("Headphones", "Wireless headphones for workouts.", 20.0));
        return giftItems;
    }
}
