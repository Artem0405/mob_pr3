package com.example.prakt_3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        String data = getIntent().getStringExtra("data");
        TextView textView = findViewById(R.id.textView2);
        textView.setText("Data received: " + data);

        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(view -> finish());
    }
}