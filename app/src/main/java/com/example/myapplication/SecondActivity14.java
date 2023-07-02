package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity14 extends AppCompatActivity {

    private Button eay, asm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second14);

        eay = findViewById(R.id.eay);
        asm = findViewById(R.id.asm);

        eay.setOnClickListener(evb);
        asm.setOnClickListener(asd);
    }
    private View.OnClickListener evb = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(),SecondActivity13.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener asd = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
    };
}