package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentServices extends AppCompatActivity {

    private Button button, button2, button3, buttonForm, buttonMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_services);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        buttonForm = (Button) findViewById(R.id.buttonForm);
        buttonMain = (Button) findViewById(R.id.buttonMain);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentServices.this,MainActivity.class);
                intent.putExtra("service","Service 1");
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentServices.this,MainActivity.class);
                intent.putExtra("service","Service 2");
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentServices.this,MainActivity.class);
                intent.putExtra("service","Service 3");
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        buttonForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentServices.this,StudentForm.class);
                startActivity(intent);
                finish();
            }
        });

        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentServices.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}