package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Button button = (Button) findViewById(R.id.button34);//просмотр
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity7.this, MainActivity33.class);
                startActivity(in);
                finish();
            }
        });

        Button buton = (Button) findViewById(R.id.button36);//термины и понятия
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity7.this, MainActivity34.class);
                startActivity(in);
                finish();
            }
        });

        Button but = (Button) findViewById(R.id.button35);//исторические личности
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity7.this, MainActivity35.class);
                startActivity(in);
                finish();
            }
        });

        Button bto = (Button) findViewById(R.id.button33);//галерея
        bto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity7.this, MainActivity36.class);
                startActivity(in);
                finish();
            }
        });

        Button btoo = (Button) findViewById(R.id.button37);//тест
        btoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity7.this, MainActivity37.class);
                startActivity(in);
                finish();
            }
        });
    }
}