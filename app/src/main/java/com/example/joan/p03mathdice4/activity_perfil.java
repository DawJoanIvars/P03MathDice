package com.example.joan.p03mathdice4;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_perfil extends Activity {
    // Variables
    private EditText nombre;
    private EditText edad;
    private String pref="pres";
    //Creo preferencias
    private SharedPreferences preferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Pongo la orientacion.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        //Elijo el layout
        setContentView(R.layout.fragment_activity_perfil);
        final Button button = (Button) findViewById(R.id.bContinuar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                preferencias = getSharedPreferences(pref, Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferencias.edit();
                nombre=(EditText)findViewById(R.id.nomText);
                edad=(EditText)findViewById(R.id.edadText);
                editor.putString("nombre", nombre.toString());
                editor.putString("edad", edad.toString());
                editor.commit();
                // Inicio el activity
                Intent mainIntent = new Intent().setClass(
                        activity_perfil.this, Activity_Principal.class);
                startActivity(mainIntent);
                finish();
            }
        });

    }
}