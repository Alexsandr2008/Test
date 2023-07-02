package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, brus, vagonka, pol, logo, gvn, lof,nkg ;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        brus = findViewById(R.id.brus);
        vagonka = findViewById(R.id.vagonka);
        pol = findViewById(R.id.pol);
        lof = findViewById(R.id.lof);
        logo = findViewById(R.id.logo);
        gvn = findViewById(R.id.gvn);
        nkg = findViewById(R.id.nkg);

        button.setOnClickListener(listener);
        brus.setOnClickListener(nwq);
        vagonka.setOnClickListener(nsd);
        lof.setOnClickListener(gjt);
        pol.setOnClickListener(ghk);
        logo.setOnClickListener(tyu);
        gvn.setOnClickListener(fgb);
        nkg.setOnClickListener(xst);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener nwq = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity2.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener nsd = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity3.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener ghk = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity4.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener tyu = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity5.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener fgb = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity17.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener gjt = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity7.class);
            startActivity(intent);
        }
    };
    private  View.OnClickListener xst = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity12.class);
            startActivity(intent);
        }
    };
}
