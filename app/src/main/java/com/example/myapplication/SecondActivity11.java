package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity11 extends AppCompatActivity {

    private Button dqe, svh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second11);

        dqe = findViewById(R.id.dqe);
        svh = findViewById(R.id.svh);

        dqe.setOnClickListener(rji);
        svh.setOnClickListener(zlp);
    }

    private View.OnClickListener rji = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity10.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener zlp = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
    };
}