package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Button button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity12.this, MainActivity38.class);
                startActivity(in);
                finish();
            }
        });

        Button buon = (Button) findViewById(R.id.button14);
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity12.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button buton = (Button) findViewById(R.id.button15);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity12.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button but = (Button) findViewById(R.id.button16);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity12.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });
    }
}