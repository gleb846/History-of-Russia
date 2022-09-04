package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button = (Button) findViewById(R.id.button40);//просмотр
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity4.this, MainActivity18.class);
                startActivity(in);
                finish();
            }
        });

        Button buton = (Button) findViewById(R.id.button42);//термины и понятия
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity4.this, MainActivity19.class);
                startActivity(in);
                finish();
            }
        });

        Button buon = (Button) findViewById(R.id.button38);// исторические личности
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity4.this, MainActivity20.class);
                startActivity(in);
                finish();
            }
        });

        Button butto= (Button) findViewById(R.id.button41);//галерея
        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity4.this, MainActivity21.class);
                startActivity(in);
                finish();
            }
        });

        Button but = (Button) findViewById(R.id.button39);//тест
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity4.this, MainActivity22.class);
                startActivity(in);
                finish();
            }
        });
    }
}