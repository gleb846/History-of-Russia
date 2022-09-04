package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button button = (Button) findViewById(R.id.button30);//просмотр
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity6.this, MainActivity28.class);
                startActivity(in);
                finish();
            }
        });

        Button buton = (Button) findViewById(R.id.button32);//термины и понятия
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity6.this, MainActivity29.class);
                startActivity(in);
                finish();
            }
        });

        Button but = (Button) findViewById(R.id.button28);//исторические личности
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity6.this, MainActivity30.class);
                startActivity(in);
                finish();
            }
        });

        Button buon = (Button) findViewById(R.id.button31);//галерея
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity6.this, MainActivity31.class);
                startActivity(in);
                finish();
            }
        });

        Button bton = (Button) findViewById(R.id.button29);//тест
        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity6.this, MainActivity32.class);
                startActivity(in);
                finish();
            }
        });
    }
}