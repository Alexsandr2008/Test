package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity9 extends AppCompatActivity {

    private Button jhk, otz;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second9);

        jhk = findViewById(R.id.jhk);
        otz = findViewById(R.id.otz);

        jhk.setOnClickListener(fnj);
        otz.setOnClickListener(qsd);
    }
    private View.OnClickListener fnj = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity5.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener qsd = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity10.class);
            startActivity(intent);
        }
    };
}