package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main43);
        Button but = (Button) findViewById(R.id.button9);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity43.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button button = (Button) findViewById(R.id.button14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity43.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button buon = (Button) findViewById(R.id.button15);
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity43.this, MainActivity41.class);
                startActivity(in);
                finish();
            }
        });

        Button buttton = (Button) findViewById(R.id.button16);
        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity43.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });
    }
}