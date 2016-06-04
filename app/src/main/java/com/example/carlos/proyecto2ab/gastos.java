package com.example.carlos.proyecto2ab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class gastos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
    }


    public void guardar1(View View){
        Toast.makeText(this, "Datos guardados con exito ", Toast.LENGTH_LONG).show();
        finish();
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.Menu.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }
}
