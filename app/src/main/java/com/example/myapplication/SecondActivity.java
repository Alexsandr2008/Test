package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button nazad, zxc, zxv, zxb, zxn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nazad = findViewById(R.id.nazad);
        zxc = findViewById(R.id.zxc);
        zxb = findViewById(R.id.zxb);
        zxv = findViewById(R.id.zxv);
        zxn = findViewById(R.id.zxn);

        nazad.setOnClickListener(listener);
        zxc.setOnClickListener(wvk);
        zxb.setOnClickListener(mda);
        zxn.setOnClickListener(you);
        zxv.setOnClickListener(saf);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener wvk = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener mda = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);

        }
    };

    private View.OnClickListener you = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener saf = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);

        }
    };
}