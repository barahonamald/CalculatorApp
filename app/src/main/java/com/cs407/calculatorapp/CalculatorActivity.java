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
        String str = intent.getStringExtra("message");
        int first = intent.getIntExtra("firstNum", 0);
        int second = intent.getIntExtra("secondNum", 0);
        int sum = first + second;
        textView.setText("The sum is " + sum);
    }
}