package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button) findViewById(R.id.button234);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity2.this, MainActivity8.class);
                startActivity(in);
                finish();
            }
        });

        Button buton = (Button) findViewById(R.id.button754);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity2.this, MainActivity9.class);
                startActivity(in);
                finish();
            }
        });

        Button but = (Button) findViewById(R.id.button876);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity2.this, MainActivity10.class);
                startActivity(in);
                finish();
            }
        });

        Button butt = (Button) findViewById(R.id.button178);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity2.this, MainActivity11.class);
                startActivity(in);
                finish();
            }
        });

        Button buon = (Button) findViewById(R.id.button183);
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity2.this, MainActivity12.class);
                startActivity(in);
                finish();
            }
        });

    }
}

