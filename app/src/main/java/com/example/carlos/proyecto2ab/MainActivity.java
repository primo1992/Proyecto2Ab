package com.example.carlos.proyecto2ab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciar(View View){
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.iniciar.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }


    public void registrarse(View View){
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.registrar.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

}
