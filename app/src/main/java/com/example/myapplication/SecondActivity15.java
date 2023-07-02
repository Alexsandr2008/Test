package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity15 extends AppCompatActivity {

    private Button gop, asv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second15);

        gop = findViewById(R.id.gop);
        asv = findViewById(R.id.asv);

        gop.setOnClickListener(yui);
        asv.setOnClickListener(ghp);
    }

    private View.OnClickListener yui = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener ghp = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity12.class);
            startActivity(intent);
        }
    };
}