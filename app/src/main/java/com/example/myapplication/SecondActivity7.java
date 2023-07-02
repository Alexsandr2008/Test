package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity7 extends AppCompatActivity {

    TextView rez;
    EditText edit1, edit2, edit3, edit4;
    private Button but, gop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second7);

        rez = findViewById(R.id.text3);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        edit4 = findViewById(R.id.edit4);
        but = findViewById(R.id.but);
        gop = findViewById(R.id.gop);

        gop.setOnClickListener(lbg);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double rez1 = Double.parseDouble(edit1.getText().toString())
                        * Double.parseDouble(edit2.getText().toString()) *
                        Double.parseDouble(edit3.getText().toString()) *
                        Double.parseDouble(edit4.getText().toString());
                but.setText(String.valueOf(rez1));
            }
        });
    }

    private View.OnClickListener lbg = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}
