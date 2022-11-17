package com.example.cambio_de_pantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ValidationActivity extends AppCompatActivity {

    TextView lblCedula, lblResultado, lblFecha, lblTemperatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);

        IniciarControles();

        Intent i = getIntent();
        if (i != null){
            PopularDatos(i);
        }

    }

    private void PopularDatos(Intent i) {
        lblCedula.setText(i.getStringExtra("cedula"));
        lblFecha.setText(i.getStringExtra("fecha"));
        double temp = i.getDoubleExtra("temperatura",0.0);
        lblTemperatura.setText(Double.toString(temp));
        lblResultado.setText("Fino");
        if (temp>36.5){
            lblResultado.setText("Ya valio, tiene Sida");
        }
    }

    private void IniciarControles() {
        lblCedula = (TextView)findViewById(R.id.lblCedula);
        lblResultado = (TextView)findViewById(R.id.lblResultado);
        lblFecha = (TextView)findViewById(R.id.lblFecha);
        lblTemperatura = (TextView)findViewById(R.id.lblTemperatura);
    }
}