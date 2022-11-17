package com.example.parcial2_jorgelacayo_migueljaramillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SelecciodePerfil extends AppCompatActivity {

    RadioGroup rgbPerfil;
    String Cedu,Cont;
    String Nombtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecciode_perfil);

        IniciarControles();
        Intent i = getIntent();
        Cedu = i.getStringExtra("cedu");
        Cont = i.getStringExtra("cont");
    }

    private void IniciarControles() {
        rgbPerfil= (RadioGroup)findViewById(R.id.rgbSeleccionar);
    }

    public void EntrarSelec(View view){
        Nombtxt = Cedu+Cont;
        String Carga="";


        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(openFileInput(Nombtxt+".txt")));
            String[] credenciales = bf.readLine().split("~");
            bf.close();
            Carga = credenciales[0];
            Toast.makeText(getApplicationContext(),"Si funciona",Toast.LENGTH_LONG).show();
        }catch (Exception e){

            Toast.makeText(getApplicationContext(),"No funciona",Toast.LENGTH_LONG).show();
        }

        switch (rgbPerfil.getCheckedRadioButtonId()){
            case R.id.rbSE:

                if (Carga.equals("Estudiante")){
                    Toast.makeText(getApplicationContext(),"Bienvenido, Estudiante",Toast.LENGTH_LONG).show();
                    Intent p = new Intent(this, SitiodeEstudiante.class);
                    startActivity(p);
                }
                else {
                    Toast.makeText(getApplicationContext(),"No eres profesor",Toast.LENGTH_LONG).show();
                }

                break;
            case  R.id.rbSESU:
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://utp.ac.pa"));
                startActivity(i);
                break;

            case  R.id.rbSP:

                if (Carga.equals("Profesor")){
                    Toast.makeText(getApplicationContext(),"Bienvenido, Profesor",Toast.LENGTH_LONG).show();
                    Intent p = new Intent(this, SitiodeProfesor.class);
                    p.putExtra("cedu", Cedu);
                    p.putExtra("cont", Cont);
                    startActivity(p);
                }
                else {
                    Toast.makeText(getApplicationContext(),"No eres Estudiante",Toast.LENGTH_LONG).show();
                }
                break;
            default:
                Toast.makeText(getApplicationContext(),"No ha seleccionado una opcion",Toast.LENGTH_LONG).show();
                break;
        }
    }
}