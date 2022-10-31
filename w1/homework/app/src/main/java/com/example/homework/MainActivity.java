package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /*
    Global variables and XML shits
    */
    private Button button1, button2, button3,button4,button5,button6,
    button7, button8, button9, button0,buttonDel,buttonAC,
    plus,minus,divide,multiply,calculate;

    private TextView textResult, textCalculate;

    private String stringCal = "=";
    private String stringRes = "Result:";

    /*
    Button listener
     */

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonDel:
                Toast.makeText(this, "Del clicked", Toast.LENGTH_SHORT).show();
                if(textCalculate.getText().toString().length() > 1 ){
                    stringCal = stringCal.substring(0,stringCal.length()-1);
                    textCalculate.setText(stringCal);
                }
                break;
            case R.id.buttonAC:
                Toast.makeText(this, "AC clicked", Toast.LENGTH_SHORT).show();
                stringCal = "=";
                textCalculate.setText(stringCal);
                break;
            default:
                Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
                Button temp = findViewById(view.getId());
                stringCal = stringCal.concat(temp.getText().toString());
                textCalculate.setText(stringCal);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(this);
        buttonDel = findViewById(R.id.buttonDel);
        buttonDel.setOnClickListener(this);
        buttonAC = findViewById(R.id.buttonAC);
        buttonAC.setOnClickListener(this);
        plus = findViewById(R.id.plus);
        plus.setOnClickListener(this);
        minus = findViewById(R.id.minus);
        minus.setOnClickListener(this);
        divide = findViewById(R.id.divide);
        divide.setOnClickListener(this);
        multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(this);
        calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(this);

        textResult = findViewById(R.id.textResult);
        textCalculate = findViewById(R.id.textCalculation);
    }


}