package com.example.joan.p03mathdice4;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Activity_Detalle extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_detalle);

        // Comprobamos que previamente no hayamos entrado en esta actividad (por ejemplo, al rotar el dispositivo). Si es así se añade el fragmento al contenedor
        if (savedInstanceState == null) {
            // Crea el fragmento del detalle de la entrada y lo añade a la actividad
            Bundle arguments = new Bundle();
            arguments.putString(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, getIntent().getStringExtra(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA));
            Fragment_Detalle fragment = new Fragment_Detalle();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.framelayout_contenedor_detalle, fragment).commit();

            Bundle arguments2 = new Bundle();
            arguments2.putString(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, getIntent().getStringExtra(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA));
            Fragment_Detalle fragment2 = new Fragment_Detalle();
            fragment2.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.frameLayout_contenedor_2, fragment2).commit();
        }
    }

}
