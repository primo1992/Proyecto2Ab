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
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.presupuesto.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }

    public void darclick2(View View){
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.presupuesto.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }
}
