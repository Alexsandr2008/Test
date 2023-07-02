package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity18 extends AppCompatActivity {

    private Button rbp, lkm;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second18);

        rbp = findViewById(R.id.rbp);
        lkm = findViewById(R.id.lkm);

        rbp.setOnClickListener(aio);
        lkm.setOnClickListener(sqfb);
    }
    private View.OnClickListener aio = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity14.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener sqfb = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity17.class);
            startActivity(intent);
        }
    };
}