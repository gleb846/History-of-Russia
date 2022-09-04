package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main46);
        Button but = (Button) findViewById(R.id.button9);//галерея
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity46.this, MainActivity47.class);
                startActivity(in);
                finish();
            }
        });

        Button button = (Button) findViewById(R.id.button14);//галерея
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity46.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button butt = (Button) findViewById(R.id.button15);//галерея
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity46.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });

        Button buon = (Button) findViewById(R.id.button16);//галерея
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity46.this, MainActivity39.class);
                startActivity(in);
                finish();
            }
        });
    }
}