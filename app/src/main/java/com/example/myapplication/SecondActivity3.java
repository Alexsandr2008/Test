package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity3 extends AppCompatActivity {

    private Button ghj, bgh, kju, gty, pik;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second3);

        ghj = findViewById(R.id.ghj);
        bgh = findViewById(R.id.bgh);
        kju = findViewById(R.id.kju);
        gty = findViewById(R.id.gty);
        pik = findViewById(R.id.pik);
        ghj.setOnClickListener(blh);

        bgh.setOnClickListener(hon);
        kju.setOnClickListener(qbp);
        gty.setOnClickListener(rpb);
        pik.setOnClickListener(zld);
        ghj.setOnClickListener(alp);
    }

    private View.OnClickListener blh = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener hon = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener qbp = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener rpb = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener zld = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener alp = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);
        }
    };

}