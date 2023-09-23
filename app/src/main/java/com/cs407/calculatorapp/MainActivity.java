package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        // grabs inputted numbers
        EditText firstNumber = findViewById(R.id.firstNumber);
        EditText secondNumber = findViewById(R.id.secondNumber);

        // converts first & second strings inputted to ints
        int first = Integer.parseInt(firstNumber.getText().toString());
        int second = Integer.parseInt(secondNumber.getText().toString());

        // does function
        int total = first + second;

       goToActivity(total);
    }

    public void subtractFunction(View view) {
        // grabs inputted numbers
        EditText firstNumber = findViewById(R.id.firstNumber);
        EditText secondNumber = findViewById(R.id.secondNumber);

        // converts first & second strings inputted to ints
        int first = Integer.parseInt(firstNumber.getText().toString());
        int second = Integer.parseInt(secondNumber.getText().toString());

        // does function
        int total = first - second;

        goToActivity(total);
    }

    public void multiplyFunction(View view) {
        // grabs inputted numbers
        EditText firstNumber = findViewById(R.id.firstNumber);
        EditText secondNumber = findViewById(R.id.secondNumber);

        // converts first & second strings inputted to ints
        int first = Integer.parseInt(firstNumber.getText().toString());
        int second = Integer.parseInt(secondNumber.getText().toString());

        // does function
        int total = first * second;

        goToActivity(total);
    }

    public void divideFunction(View view) {
        // grabs inputted numbers
        EditText firstNumber = findViewById(R.id.firstNumber);
        EditText secondNumber = findViewById(R.id.secondNumber);

        // converts first & second strings inputted to ints
        double first = Integer.parseInt(firstNumber.getText().toString());
        double second = Integer.parseInt(secondNumber.getText().toString());

        // if divide by 0, prompts for new number
        if (second == 0.0) {
            Toast.makeText(MainActivity.this, "Cannot divide by 0. Choose new number.", Toast.LENGTH_LONG).show();
        }
        else {
            // does function
            double total = first / second;
            goToActivity(total);
        }
    }

    public void goToActivity(int total) {
        Intent intent = new Intent(this, CalculatorActivity.class);

        // stores inputted values for CalculatorActivity.java
        intent.putExtra("total", total);

        startActivity(intent);
    }

    public void goToActivity(double total) {
        Intent intent = new Intent(this, CalculatorActivity.class);

        // stores inputted values for CalculatorActivity.java
        intent.putExtra("divide", total);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}