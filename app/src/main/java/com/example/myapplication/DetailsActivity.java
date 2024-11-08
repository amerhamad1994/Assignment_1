package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ListView detailsListView = findViewById(R.id.listview_details);
        String serviceType = getIntent().getStringExtra("service_type");

        List<String> items = new ArrayList<>();
        if ("GYM Subscriptions".equals(serviceType)) {
            for (Subscription subscription : MockDataProvider.getSubscriptions()) {
                items.add(subscription.getName());
            }
        } else if ("Proteins and GYM Food".equals(serviceType)) {
            for (ProteinProduct product : MockDataProvider.getProteinProducts()) {
                items.add(product.getName());
            }
        } else if ("Gift Shop".equals(serviceType)) {
            for (GiftItem item : MockDataProvider.getGiftItems()) {
                items.add(item.getName());
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        detailsListView.setAdapter(adapter);

        detailsListView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(DetailsActivity.this, InfoActivity.class);
            intent.putExtra("item_name", items.get(position));
            intent.putExtra("service_type", serviceType);
            intent.putExtra("item_position", position);
            startActivity(intent);
        });
    }
}
