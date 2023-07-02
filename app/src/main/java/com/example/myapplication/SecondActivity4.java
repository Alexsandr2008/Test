package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity4 extends AppCompatActivity {

  private Button lju, jkm, kjh, khu, mio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second4);

        lju = findViewById(R.id.lju);
        jkm = findViewById(R.id.jkm);
        kjh = findViewById(R.id.kjh);
        khu = findViewById(R.id.khu);
        mio = findViewById(R.id.mio);


        lju.setOnClickListener(hjk);
        jkm.setOnClickListener(gzl);
        kjh.setOnClickListener(wlb);
        khu.setOnClickListener(gpv);
        mio.setOnClickListener(zle);
    }
    private View.OnClickListener hjk = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener gzl = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener wlb = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener gpv = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener zle = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };

}

