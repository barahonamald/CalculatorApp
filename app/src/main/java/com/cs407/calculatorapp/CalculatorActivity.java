package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);

        textView = findViewById(R.id.textView);
        Intent intent=getIntent();

        // gets both inputs
        int total = intent.getIntExtra("total", -69);
        if (total == -69) {
            double newTotal = intent.getDoubleExtra("divide", 0.0);
            textView.setText(""+newTotal);
        }
        else
            textView.setText("" + total);

    }
}