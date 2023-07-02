package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity5 extends AppCompatActivity {

    private Button lop, wet, rtf, gty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second5);

        lop = findViewById(R.id.lop);
        wet = findViewById(R.id.wet);
        rtf = findViewById(R.id.rtf);
        gty = findViewById(R.id.gty);

        lop.setOnClickListener(bhl);
        wet.setOnClickListener(fvl);
        rtf.setOnClickListener(yut);
        gty.setOnClickListener(wev);
    }

    private View.OnClickListener bhl = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener fvl = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity6.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener yut = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity8.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener wev = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity9.class);
            startActivity(intent);
        }
    };
}
