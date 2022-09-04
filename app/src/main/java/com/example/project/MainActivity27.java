package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);
        Button but = (Button) findViewById(R.id.button9);//галерея
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity27.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button buon = (Button) findViewById(R.id.button14);//галерея
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity27.this, MainActivity46.class);
                startActivity(in);
                finish();
            }
        });

        Button button = (Button) findViewById(R.id.button15);//галерея
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity27.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button buttoon = (Button) findViewById(R.id.button16);//галерея
        buttoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity27.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });
    }
}