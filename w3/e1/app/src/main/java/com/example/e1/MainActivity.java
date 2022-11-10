package com.example.e1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtName, editTxtAge;
    private RadioButton radioBtnMarketing, radioBtnProfCom, radioBtnSE, radioBtnIT;
    private CheckBox checkBoxNeeds, checkBoxScholar;
    private Button btnSave;
    private String program = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtName = (EditText) findViewById(R.id.editTxtName);
        editTxtAge = (EditText) findViewById(R.id.editTxtAge);
        checkBoxNeeds = (CheckBox) findViewById(R.id.checkBoxNeeds);
        checkBoxScholar = (CheckBox) findViewById(R.id.checkBoxScholar);
        btnSave = (Button) findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String needs = "No";
                String scholar = "No";
                if(checkBoxNeeds.isChecked()){
                    needs = "Yes";
                }
                if(checkBoxScholar.isChecked()){
                    scholar = "Yes";
                }

                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("Name",editTxtName.getText().toString());
                intent.putExtra("Age",editTxtAge.getText().toString());
                intent.putExtra("Course",program);
                intent.putExtra("Needs",needs);
                intent.putExtra("Scholarship",scholar);
                startActivity(intent);
            }
        });
    }

    public void radioBtnCheck(View v){
        RadioButton radioButton = (RadioButton) v;
        program = radioButton.getText().toString();
    }
}