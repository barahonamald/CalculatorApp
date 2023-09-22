package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        Log.i("INFO", "Button Pressed");

        EditText firstNumber = findViewById(R.id.firstNumber);
        EditText secondNumber = findViewById(R.id.secondNumber);
        Toast.makeText(MainActivity.this, firstNumber.getText(), Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, secondNumber.getText(), Toast.LENGTH_LONG).show();

        //goToActivity(firstNumber.getText().toString());
    }

    public void goToActivity(int firstNum, int secondNum) {
        //Intent intent=new Intent(this, CalculatorActivity.class);
        //intent.putExtra("message", firstNum, "message", secondNum);
      //  startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}