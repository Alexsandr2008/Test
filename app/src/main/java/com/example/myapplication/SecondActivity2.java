package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity2 extends AppCompatActivity {

    private Button cvb, asq, asg, asd, asf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        cvb = findViewById(R.id.cvb);
        asg = findViewById(R.id.asg);
        asq = findViewById(R.id.asq);
        asd = findViewById(R.id.asd);
        asf = findViewById(R.id.asf);

        cvb.setOnClickListener(listener);
        asq.setOnClickListener(rvh);
        asg.setOnClickListener(xqi);
        asd.setOnClickListener(clp);
        asf.setOnClickListener(zxa);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener rvh = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener xqi = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener clp = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(),SecondActivity15.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener zxa = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity15.class);
            startActivity(intent);
        }
    };
}