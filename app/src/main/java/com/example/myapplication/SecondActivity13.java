package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity13 extends AppCompatActivity {

    private Button eay ,eaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second13);

        eay = findViewById(R.id.eay);
        eaz = findViewById(R.id.eaz);

        eay.setOnClickListener(wqg);
        eaz.setOnClickListener(rcj);
    }
    private View.OnClickListener wqg = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(),SecondActivity12.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener rcj = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(),SecondActivity14.class);
            startActivity(intent);
        }
    };
}