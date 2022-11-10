package com.example.e1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String age = intent.getStringExtra("Age");
        String program = intent.getStringExtra("Course");
        String needs = intent.getStringExtra("Needs");
        String scholar = intent.getStringExtra("Scholarship");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(name + "\n" + age + "\n" + program + "\n" + needs + "\n" + scholar);
    }
}