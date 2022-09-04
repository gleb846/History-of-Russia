package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Button but = (Button) findViewById(R.id.button9);//термины и понятия
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity22.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button buton = (Button) findViewById(R.id.button14);//термины и понятия
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity22.this, MainActivity44.class);
                startActivity(in);
                finish();
            }
        });

        Button butto = (Button) findViewById(R.id.button15);//термины и понятия
        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity22.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button butoon = (Button) findViewById(R.id.button16);//термины и понятия
        butoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity22.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });
    }
}