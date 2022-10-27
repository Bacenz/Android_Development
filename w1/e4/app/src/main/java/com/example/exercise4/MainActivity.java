package com.example.exercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonPlay = findViewById(R.id.buttonPlay);
        TextView textNumber = findViewById(R.id.textNumber);
        TextView textWin = findViewById(R.id.textWin);
        EditText editTextGuess = findViewById(R.id.editTextGuess);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int rd = rand.nextInt(10) + 1;
                textNumber.setText("Number: " + rd);
                if(rd == Integer.parseInt(editTextGuess.getText().toString())){
                    Toast.makeText(MainActivity.this, "You win", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You lose", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}