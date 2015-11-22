package com.example.joan.p03mathdice4;

/**
 * Created by Joan on 14/10/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {

    // Tiempo del timer
    private static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Pongo la orientacion.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        // Quito la barra de titulo.(Cambio: EN EL MAINFEST.XML SE ELIMINA CON EL THEME)
        //requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.imagen);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // Inicio el activity
                Intent mainIntent = new Intent().setClass(
                        SplashActivity.this, Activity_Principal.class);
                startActivity(mainIntent);
                finish();
            }
        };

        // Creo el timer y le doy el tiempo.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

}