package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity17 extends AppCompatActivity {

    private Button lrq, aqo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second17);

        lrq = findViewById(R.id.lrq);
        aqo = findViewById(R.id.aqo);

        lrq.setOnClickListener(sbl);
        aqo.setOnClickListener(vlhp);
    }
    private View.OnClickListener sbl = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity5.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener vlhp = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity18.class);
            startActivity(intent);
        }
    };
}