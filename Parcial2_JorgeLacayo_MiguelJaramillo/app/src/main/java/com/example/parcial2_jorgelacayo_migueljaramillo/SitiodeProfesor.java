package com.example.parcial2_jorgelacayo_migueljaramillo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SitiodeProfesor extends AppCompatActivity {
    String Cedu,Cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitiode_profesor);

        Intent i = getIntent();
        Cedu = i.getStringExtra("cedu");
        Cont = i.getStringExtra("cont");
    }

    //MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }
//ITEMS
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Edicion",Toast.LENGTH_LONG).show();
                Intent p = new Intent(this, SitiodeProfesor.class);
                p.putExtra("cedu", Cedu);
                p.putExtra("cont", Cont);
                startActivity(p);
                break;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Se agregara una nota",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}