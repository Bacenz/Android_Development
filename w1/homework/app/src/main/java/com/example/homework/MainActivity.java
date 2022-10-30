package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3,button4,button5,button6,
    button7, button8, button9, button0,buttonDel,buttonAC, buttonPlus,
    plus,minus,divide,multiply,calculate;

    private TextView textResult, textCalculate;

    private String stringCal = "=";
    private String stringRes = "Result:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}