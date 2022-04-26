package com.yamisagi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);


    }


    public void sum(View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter number");
        } else {
            int first = Integer.parseInt(number1.getText().toString());
            int second = Integer.parseInt(number2.getText().toString());
            int resultText = first + second;
            result.setText("Result : " + resultText);

        }
    }

    public void dec(View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter number");
        } else {
            int first = Integer.parseInt(number1.getText().toString());
            int second = Integer.parseInt(number2.getText().toString());
            int resultText = first - second;
            result.setText("Result : " + resultText);

        }
    }

    public void multiply(View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter number");
        } else {
            int first = Integer.parseInt(number1.getText().toString());
            int second = Integer.parseInt(number2.getText().toString());
            int resultText = first * second;
            result.setText("Result : " + resultText);

        }
    }

    public void div(View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            result.setText("Enter number");
        } else {
            int first = Integer.parseInt(number1.getText().toString());
            int second = Integer.parseInt(number2.getText().toString());
            int resultText = first / second;
            result.setText("Result : " + resultText);

        }
    }


}