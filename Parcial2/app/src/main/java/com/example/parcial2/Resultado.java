package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Resultado extends AppCompatActivity {
    public static Integer [] Cuadrado = new Integer[5];
    public static Integer [] ListaNum = new Integer[5];
    public static double suma, media;
    public static Integer num;

    public static Integer c;
    private Button button, at;
    private EditText edt;
    private TextView tr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer num = Integer.valueOf(edt.getText().toString());
                for (int i=0; i<=4;i++){
                    num = 0;
                    num = ListaNum[i];
                }

                //Integer Control = intent.getIntergerExtra("con", 0);
                //Mostrar resultados

                if (MainActivity.n==1){
                    for (int i=0; i<=4;i++){
                        c = 0;
                        c = ListaNum[i] * ListaNum[i];
                        Cuadrado [i] = c;
                        tr.setText("El cuadrado" + (i+1) + "es:" + ListaNum[i]);
                    }

                }
                else if (MainActivity.n==2){
                    for (int i=0; i<=4;i++){
                        suma = suma + ListaNum[i];
                    }
                    media = suma / ListaNum.length;
                    tr.setText("La media es:" + media);
                }

            }
        });

        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }


}