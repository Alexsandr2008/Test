package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity10 extends AppCompatActivity {

    private Button jgn, gnj;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second10);

        jgn = findViewById(R.id.jgn);
        gnj = findViewById(R.id.gnj);

        jgn.setOnClickListener(lom);
        gnj.setOnClickListener(rkm);
    }
    private View.OnClickListener lom = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity9.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener rkm = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity11.class);
            startActivity(intent);
        }
    };
}