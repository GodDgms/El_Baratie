package com.example.practica_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView rs;
    public Float res;
    public Float re;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        rs = findViewById(R.id.tv);

        Intent e = getIntent();
        re = e.getFloatExtra("resultado",0);

        rs.setText("El resultado es " + re);

    }
}