package com.example.carlos.proyecto2ab;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class presupuesto extends AppCompatActivity {

    private CheckBox chkShowThisPage;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presupuesto);
    }

    public void mensaje (View view) {

        Toast.makeText(this, "Datos guardados con exito " , Toast.LENGTH_LONG).show();
        finish();


        Intent i = new Intent(this, com.example.carlos.proyecto2ab.Menu.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }


    public  void seleccionar (View view){
        chkShowThisPage = (CheckBox) findViewById(R.id.chkShowThisPage);


        TextView tex2 = (TextView)findViewById(R.id.textView5);
        TextView tex1 = (TextView)findViewById(R.id.textView6);
        EditText edi1 = (EditText) findViewById(R.id.editText4);
        EditText edi = (EditText) findViewById(R.id.editText5);
        CheckBox proactives = (CheckBox) findViewById(R.id.proactives);
        if(view.getId() == R.id.checkBox)
        {
            edi.setVisibility(View.VISIBLE);
            edi1.setVisibility(View.VISIBLE);
            tex1.setVisibility(View.VISIBLE);
            tex2.setVisibility(View.VISIBLE);

        }
        if(view.getId() != R.id.checkBox)
        {
            edi.setVisibility(View.INVISIBLE);
            edi1.setVisibility(View.INVISIBLE);
            tex1.setVisibility(View.INVISIBLE);
            tex2.setVisibility(View.INVISIBLE);
        }



    }

    //ImageView img = (ImageView) findViewById(R.id.imageView7);
    //if (view.getId() == R.id.checksom) {
    //  img.setImageResource(R.drawable.hat);
    //  img.setVisibility(View.VISIBLE);

    //}


}
