package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        Button but = (Button) findViewById(R.id.button9);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity17.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button button = (Button) findViewById(R.id.button14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity17.this, MainActivity42.class);
                startActivity(in);
                finish();
            }
        });

        Button buton = (Button) findViewById(R.id.button15);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity17.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button butt = (Button) findViewById(R.id.button16);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity17.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });
    }
}