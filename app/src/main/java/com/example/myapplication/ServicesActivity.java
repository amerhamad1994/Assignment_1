package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ServicesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        ListView servicesListView = findViewById(R.id.listview_services);
        String[] services = {"GYM Subscriptions", "Proteins and GYM Food", "Gift Shop"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, services);
        servicesListView.setAdapter(adapter);

        servicesListView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(ServicesActivity.this, DetailsActivity.class);
            intent.putExtra("service_type", services[position]);
            startActivity(intent);
        });

        // Footer TextView
        TextView footerTextView = findViewById(R.id.footer_text);
        footerTextView.setText("Made By Amer Hamad");
    }
}