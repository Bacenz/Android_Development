package com.example.part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Intent intent = getIntent();
        String message = (String) intent.getExtras().get("message");
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(NewActivity.this,MainActivity.class);
                intent1.putExtra("response_message","thanks");
                setResult(RESULT_OK,intent1);
                finish();
            }
        });
    }
}