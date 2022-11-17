package com.example.revalida_dianamoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.content.Intent;

public class Resultado extends AppCompatActivity {

    private TextView tvr;
    private EditText et1, et2,et3,et4,et5,et6,et7;
    private Button bb, ba;
    public static int [] n = new int [7];
    public static int num, nc, s, v;
    public static float p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        //variables
        et1 = (EditText)findViewById(R.id.ED1);
        et2 = (EditText)findViewById(R.id.ED2);
        et3 = (EditText)findViewById(R.id.ED3);
        et4 = (EditText)findViewById(R.id.ED4);
        et5 = (EditText)findViewById(R.id.ED5);
        et6 = (EditText)findViewById(R.id.ED6);
        et7 = (EditText)findViewById(R.id.ED7);
        tvr = (TextView)findViewById(R.id.Tvr);
        ba = (Button)findViewById(R.id.btb);
        bb = (Button)findViewById(R.id.Bta);
    }

    public void calcular(View view){
                //guardar en el arreglo
                s = Integer.parseInt(et1.getText().toString()) +Integer.parseInt(et2.getText().toString())+ Integer.parseInt(et3.getText().toString()) + Integer.parseInt(et4.getText().toString())+Integer.parseInt(et5.getText().toString())+Integer.parseInt(et6.getText().toString())+Integer.parseInt(et7.getText().toString());;

            p = s/7;
            tvr.setText("El promedio es " + p );

        }

    public void Atras(View view){
        Intent anterior =  new Intent(getApplicationContext(), MainActivity.class);
        startActivity(anterior);
    }
}