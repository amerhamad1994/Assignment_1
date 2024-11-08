package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class MockDataProvider {

    public static List<Subscription> getSubscriptions() {
        List<Subscription> subscriptions = new ArrayList<>();
        subscriptions.add(new Subscription(
                "Annual Subscription",
                "One-year access to all gym facilities, including cardio and weight training equipment, " +
                        "unlimited access to group fitness classes, yoga sessions, and personalized training plans. " +
                        "Enjoy access to the sauna, steam room, and exclusive members-only events throughout the year. " +
                        "This package is perfect for those committed to a long-term fitness journey.",
                600
        ));
        subscriptions.add(new Subscription(
                "Monthly Subscription",
                "One-month access to all gym facilities, including a variety of fitness equipment, " +
                        "group classes such as HIIT, yoga, and pilates. Perfect for those looking to try out " +
                        "our gym facilities before committing to a longer subscription. Membership includes " +
                        "access to locker rooms and showers, making it convenient for busy individuals.",
                100
        ));
        return subscriptions;
    }

    public static List<ProteinProduct> getProteinProducts() {
        List<ProteinProduct> proteinProducts = new ArrayList<>();
        proteinProducts.add(new ProteinProduct(
                "Whey Protein",
                "High-quality whey protein powder for muscle building and recovery. " +
                        "Contains 24g of protein per serving, low in fat and carbs, and packed with BCAAs to " +
                        "support muscle growth. Perfect for athletes and fitness enthusiasts looking to build " +
                        "lean muscle. Available in delicious flavors like chocolate, vanilla, and strawberry.",
                44
        ));
        proteinProducts.add(new ProteinProduct(
                "Casein Protein",
                "Slow-release casein protein, ideal for muscle recovery and growth. " +
                        "Provides sustained amino acid release overnight, making it perfect as a nighttime " +
                        "protein. Contains 25g of protein per serving and is low in sugar. Ideal for anyone " +
                        "focused on muscle recovery. Comes in chocolate and vanilla flavors.",
                70
        ));
        return proteinProducts;
    }

    public static List<GiftItem> getGiftItems() {
        List<GiftItem> giftItems = new ArrayList<>();
        giftItems.add(new GiftItem(
                "Gym T-Shirt",
                "Comfortable and breathable T-shirt with the gym's official logo, " +
                        "perfect for workouts or casual wear. Made from high-quality, sweat-wicking fabric " +
                        "that keeps you cool and dry. Available in multiple sizes and colors to fit your style.",
                15.0
        ));
        giftItems.add(new GiftItem(
                "Gym Shoes",
                "Durable and lightweight gym shoes designed for all types of workouts, " +
                        "including running, weightlifting, and cross-training. Featuring advanced shock absorption " +
                        "and a non-slip sole for maximum comfort and safety during exercise. Available in various sizes.",
                50.0
        ));
        giftItems.add(new GiftItem(
                "Headphones",
                "Wireless headphones with high-quality sound and noise cancellation, perfect for workouts. " +
                        "With a comfortable, secure fit, these headphones are sweat-resistant and have a long battery life, " +
                        "making them ideal for long gym sessions. Includes a built-in microphone for hands-free calls.",
                20.0
        ));
        return giftItems;
    }
}
