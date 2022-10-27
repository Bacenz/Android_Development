package com.example.hellormit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editWeight, editHeight;
    private TextView textChange, textBMI;
    private Button buttonChange, buttonCalculate;
    private boolean system = true;

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonChange:
                if(system){
                    system = false;
                    textChange.setText("Current system: Inches");
                } else {
                    system = true;
                    textChange.setText("Current system: Meters");
                }
                break;
            case R.id.buttonCalculate:
                double height = Double.parseDouble(editHeight.getText().toString());
                double weight = Double.parseDouble(editWeight.getText().toString());
                double BMI = 0;
                if(!system){
                    height = (height / 39.37);
                    weight = (weight /2.205);
                }
                BMI = weight/(height*height);
                textBMI.setText("BMI: " + (BMI));
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editWeight = findViewById(R.id.editWeight);
        editHeight = findViewById(R.id.editHeight);
        textChange = findViewById(R.id.textChange);
        textBMI = findViewById(R.id.textBMI);
        buttonChange = findViewById(R.id.buttonChange);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textChange.setText("Current system: Meters");
        buttonChange.setOnClickListener(this);
        buttonCalculate.setOnClickListener(this);
    }



}