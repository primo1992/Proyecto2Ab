package com.example.carlos.proyecto2ab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class presupuesto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presupuesto);
    }

    public void mensaje (View view) {
        Intent i = new Intent(this, com.example.carlos.proyecto2ab.MainActivity.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }


    

}
