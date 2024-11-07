package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button getStartedButton = findViewById(R.id.button_get_started);
        getStartedButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ServicesActivity.class);
            startActivity(intent);
        });

        // Footer TextView
        TextView footerTextView = findViewById(R.id.footer_text);
        footerTextView.setText("Made By Amer Hamad");
    }
}
