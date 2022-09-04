package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button button = (Button) findViewById(R.id.button25);//просмотр
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity5.this, MainActivity23.class);
                startActivity(in);
                finish();
            }
        });

        Button buton = (Button) findViewById(R.id.button26);// термины и понятия
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity5.this, MainActivity24.class);
                startActivity(in);
                finish();
            }
        });

        Button buon = (Button) findViewById(R.id.button27);//исторические личности
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity5.this, MainActivity25.class);
                startActivity(in);
                finish();
            }
        });

        Button but = (Button) findViewById(R.id.button827);//галерея
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity5.this, MainActivity26.class);
                startActivity(in);
                finish();
            }
        });

        Button bon = (Button) findViewById(R.id.button24);//тест
        bon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity5.this, MainActivity27.class);
                startActivity(in);
                finish();
            }
        });
    }
}