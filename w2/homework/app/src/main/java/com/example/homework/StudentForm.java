package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = "";
        if(bundle!=null){
            name = (String) bundle.get("name");
            EditText editTextName = (EditText) findViewById(R.id.editTextName);
            editTextName.setText(name);
        }

        Button buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        String finalName = name;
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(StudentForm.this,MainActivity.class);
                intent1.putExtra("response", finalName);
                setResult(RESULT_OK,intent1);
                finish();
            }
        });

        Button buttonMain = (Button) findViewById(R.id.buttonMain);
        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(StudentForm.this,MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });

        Button buttonSrv = (Button) findViewById(R.id.buttonSrv);
        buttonSrv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(StudentForm.this,StudentServices.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}