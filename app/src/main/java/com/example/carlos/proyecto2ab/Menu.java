package com.example.carlos.proyecto2ab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void darclick1(View View){
        //Toast.makeText(this, "Datos guardados con exito ", Toast.LENGTH_LONG).show();
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.presupuesto.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

    public void darclick2(View View){
        //Toast.makeText(this, "Datos guardados con exito ", Toast.LENGTH_LONG).show();
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.gastos.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }


    public void darclick3(View View){
        //Toast.makeText(this, "Datos guardados con exito ", Toast.LENGTH_LONG).show();
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.balance.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }



    public void darclick4(View View){
        //Toast.makeText(this, "Datos guardados con exito ", Toast.LENGTH_LONG).show();
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.consejos.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

    public void darclick5(View View){
        //Toast.makeText(this, "Datos guardados con exito ", Toast.LENGTH_LONG).show();
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.ahorro.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

    public void darclick6(View View){
        //Toast.makeText(this, "Datos guardados con exito ", Toast.LENGTH_LONG).show();
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.perfil.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

    public void salir(View View){
        //Toast.makeText(this, "Datos guardados con exito ", Toast.LENGTH_LONG).show();
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.MainActivity.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

    public void usuario(View View){
        //Toast.makeText(this, "Datos guardados con exito ", Toast.LENGTH_LONG).show();
        //finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.usuarios.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }
}

