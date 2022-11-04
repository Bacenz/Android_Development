package com.example.homework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonForm = (Button) findViewById(R.id.buttonMain);
        Button buttonSrv = (Button) findViewById(R.id.buttonSrv);
        EditText editTextName = (EditText) findViewById(R.id.editTextName);

        buttonForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,StudentForm.class);
                intent.putExtra("name",editTextName.getText().toString());
                startActivityForResult(intent,100);
            }
        });

        buttonSrv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,StudentServices.class);
                startActivityForResult(intent,200);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 100){
            if(resultCode == RESULT_OK){
                String res = "";
                Bundle bundle = data.getExtras();
                if(bundle!=null){
                    res = (String) bundle.get("response");
                }
                Toast.makeText(this, "Thank you " + res + " for submitting your form", Toast.LENGTH_SHORT).show();
            }
        } else if(requestCode == 200){
            if(resultCode == RESULT_OK){
                String res = "";
                Bundle bundle = data.getExtras();
                if(bundle!=null){
                    res = (String) bundle.get("service");
                }
                Toast.makeText(this, "Thank you for selecting " + res, Toast.LENGTH_SHORT).show();
            }
        }
    }
}