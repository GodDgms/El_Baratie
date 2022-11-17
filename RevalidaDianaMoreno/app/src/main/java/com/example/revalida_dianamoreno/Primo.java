package com.example.revalida_dianamoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Primo extends AppCompatActivity {

    EditText edp;
    TextView tvpr;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primo);
        edp = findViewById(R.id.edp);
        tvpr = findViewById(R.id.tvpr);

    }
    int s, num;


    public void Calcular (View view) {

        num = Integer.parseInt(edp.getText().toString());
            //primo

            s = 0;
            for (int i = 1; i <=num ; i++) {
                if ((num % i) == 0){
                    s = s +1;
                }
                if(s <= 2) {
                    tvpr.setText("El numero " +num + " es primo");
                }
                else{
                    tvpr.setText("El numero " +num + " no es primo");
                }
            }

        }

        public void Regresar(View view){
            Intent r = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(r);
        }

    }