package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class SecondActivity12 extends AppCompatActivity {

    private Button tnk,fvgop, vnjkl, asdfg;
    private EditText rtg, dsd, vfd;
    private TextView ljb;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second12);

        tnk = findViewById(R.id.tnkj);
        fvgop = findViewById(R.id.fvgop);
        vnjkl = findViewById(R.id.vnjkl);
        asdfg = findViewById(R.id.asdfg);
        dsd = findViewById(R.id.dsd);
        rtg = findViewById(R.id.rtg);
        vfd = findViewById(R.id.vfd);
        ljb = findViewById(R.id.ljb);


        tnk.setOnClickListener(gob);
        asdfg.setOnClickListener(rom);
        fvgop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double rez1 = Double.parseDouble(rtg.getText().toString())
                        * Double.parseDouble(vfd.getText().toString());
                ljb.setText(String.valueOf(rez1));
            }
        });
        vnjkl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double rez1 = Double.parseDouble(rtg.getText().toString())
                        * Double.parseDouble(vfd.getText().toString());
                ljb.setText(String.valueOf(rez1));
            }
        });
    }
    private View.OnClickListener gob = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener rom = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(),SecondActivity13.class);
            startActivity(intent);
        }
    };
}
