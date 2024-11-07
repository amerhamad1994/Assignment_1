package com.example.myapplication;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String itemName = getIntent().getStringExtra("item_name");
        String serviceType = getIntent().getStringExtra("service_type");
        int itemPosition = getIntent().getIntExtra("item_position", 0);

        TextView nameTextView = findViewById(R.id.item_name);
        TextView priceTextView = findViewById(R.id.item_price);
        Spinner descriptionSpinner = findViewById(R.id.item_description_spinner);
        Button buyNowButton = findViewById(R.id.buy_now_button);

        nameTextView.setText(itemName);

        String description = "";
        double price = 0.0;

        if ("GYM Subscriptions".equals(serviceType)) {
            Subscription subscription = MockDataProvider.getSubscriptions().get(itemPosition);
            description = subscription.getDescription();
            price = subscription.getPrice();
        } else if ("Proteins and GYM Food".equals(serviceType)) {
            ProteinProduct product = MockDataProvider.getProteinProducts().get(itemPosition);
            description = product.getDescription();
            price = product.getPrice();
        } else if ("Gift Shop".equals(serviceType)) {
            GiftItem giftItem = MockDataProvider.getGiftItems().get(itemPosition);
            description = giftItem.getDescription();
            price = giftItem.getPrice();
        }

        priceTextView.setText(String.format("Price: $%.2f", price));

        // Populate the spinner with the description
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{description});
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        descriptionSpinner.setAdapter(spinnerAdapter);

        // Set click listener for Buy Now button to open dialer with phone number
        buyNowButton.setOnClickListener(view -> {
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:0598542233"));
            startActivity(dialIntent);
        });
    }
}
