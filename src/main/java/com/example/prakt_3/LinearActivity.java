package com.example.prakt_3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        EditText dataEditText = findViewById(R.id.editText_data);
        Button sendDataButton = findViewById(R.id.button_send_data);

        sendDataButton.setOnClickListener(view -> {
            String data = dataEditText.getText().toString();
            Intent intent = new Intent(LinearActivity.this, RelativeActivity.class);
            intent.putExtra("data", data);
            startActivity(intent);
        });
    }
}