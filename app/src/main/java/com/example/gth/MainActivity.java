package com.example.gth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
    }

    public void scanQrCode(View view) {
        button = findViewById(R.id.button);
        Toast.makeText(this, "Button was Clicked", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,QRGenerator.class);
        startActivity(intent);
    }
}