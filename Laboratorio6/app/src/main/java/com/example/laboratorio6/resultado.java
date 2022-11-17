package com.example.laboratorio6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resultado extends AppCompatActivity {
    TextView tvres;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        tvres=findViewById(R.id.tvres);
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double PI = 3.141592;
                Intent intent = getIntent();
                double geta = intent.getDoubleExtra("altura", 0);
                double getg = intent.getDoubleExtra("generatriz", 0);
                double area= PI*geta*getg;
                tvres.setText(area+"");
            }
        });
    }
}