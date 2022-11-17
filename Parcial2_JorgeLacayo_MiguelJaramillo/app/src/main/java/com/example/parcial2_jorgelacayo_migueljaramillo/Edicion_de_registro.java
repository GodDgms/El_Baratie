package com.example.parcial2_jorgelacayo_migueljaramillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Edicion_de_registro extends AppCompatActivity {

    EditText txtNombreEd, txtContraseñaEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edicion_de_registro);

        IniciarControles();
    }

    private void IniciarControles() {

        txtNombreEd = (EditText)findViewById(R.id.txtNombreEd);
        txtContraseñaEd = (EditText)findViewById(R.id.txtContraseña);
    }

    public void EntrarEd(View view) {
        Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
    }
}