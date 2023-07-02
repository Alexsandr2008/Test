package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity8 extends AppCompatActivity {

    private Button dgb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second8);

        dgb = findViewById(R.id.dgb);

        dgb.setOnClickListener(jlo);
    }
    private View.OnClickListener jlo = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity5.class);
            startActivity(intent);
        }
    };
}