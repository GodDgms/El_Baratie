package com.example.a8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView verpc, verbono, verletra, verletrames, verapro;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        verpc=findViewById(R.id.verpc);
        verbono=findViewById(R.id.verbono);
        verletra=findViewById(R.id.verletra);
        verletrames=findViewById(R.id.verletrames);
        verapro=findViewById(R.id.verapro);
        button2=findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    double bono=0;
                    double precio;
                    double ai;
                    double letra;
                    double salario;
                    double sap;


                    double getsalario = intent.getDoubleExtra("salario", 0);
                    double getPrecioCasa = intent.getDoubleExtra("Precio de Casa", 0);



                    if (getsalario < 70000) {

                        bono = 10000;
                        precio=getPrecioCasa-bono;
                        verpc.setText("Precio con bono: "+precio);
                        verbono.setText("Si BONO");
                        ai=precio*0.05;
                        letra= (precio-ai)/360;



                    }else{
                        precio=getPrecioCasa;
                        verpc.setText("Precio: "+precio);
                        verbono.setText("NO BONO");
                        ai=precio*0.05;
                        letra= (precio-ai)/360;
                    }

                    salario = getsalario;
                    sap=salario*0.30;
                    verletra.setText("letra:" +letra);
                    verletrames.setText("30porcieto salario;" +sap);

                    if (sap >= letra ){
                        verapro.setText("aprobado");
                    }else{
                        verapro.setText("NO aprobado");
                    }

                }
            });





        }
}