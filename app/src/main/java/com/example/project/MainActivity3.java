package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button = (Button) findViewById(R.id.button1235); //просмотр
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity3.this, MainActivity13.class);
                startActivity(in);
                finish();
            }
        });

        Button buton = (Button) findViewById(R.id.button10); //термины и понятия
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity3.this, MainActivity14.class);
                startActivity(in);
                finish();
            }
        });

        Button but = (Button) findViewById(R.id.button13); //исторические личности
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity3.this, MainActivity15.class);
                startActivity(in);
                finish();
            }
        });

        Button buon = (Button) findViewById(R.id.button11);
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity3.this, MainActivity16.class); //галерея
                startActivity(in);
                finish();
            }
        });

        Button bton = (Button) findViewById(R.id.button12);//тест
        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity3.this, MainActivity17.class);
                startActivity(in);
                finish();
            }
        });
    }
}