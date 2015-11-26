package com.example.joan.p03mathdice4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Activity_Principal extends FragmentActivity implements Fragment_Lista.Callbacks {

    private boolean dosFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_principal_listado);

        if (findViewById(R.id.framelayout_contenedor_detalle) != null) {
            dosFragmentos = true;
        }
    }

    @Override
    public void onEntradaSelecionada(String id) {
        if (dosFragmentos) {
            Bundle arguments = new Bundle();
            arguments.putString(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, id);
            Fragment_Detalle fragment = new Fragment_Detalle();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_contenedor_detalle, fragment).commit();

            Bundle arguments2 = new Bundle();
            arguments2.putString(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, id);
            Fragment_Detalle fragment2 = new Fragment_Detalle();
            fragment2.setArguments(arguments2);
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_contenedor_2, fragment2).commit();

        } else {
            Intent detailIntent = new Intent(this, Activity_Detalle.class);
            detailIntent.putExtra(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, id);
            startActivity(detailIntent);
        }
    }
}