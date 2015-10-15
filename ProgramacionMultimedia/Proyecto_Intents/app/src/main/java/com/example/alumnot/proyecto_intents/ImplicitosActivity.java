package com.example.alumnot.proyecto_intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Daniel Marcos Lorrio on 15/10/15.
 */
public class ImplicitosActivity extends Activity {

    // Miembros de la clase
    private final int RC_SELECT_PHOTO = 1;
    private final int RC_TAKE_PHOTO = 2;

    // Para manejar las URI de las imagenes
    private String imagePath = null;

    /**
     * Metodo oncreate que mostrara el layout
     *
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicitos);
    }

    @Override
    /**
     * Metodo onPause que borrara la imagen al minimizar la aplicacion
     */
    protected void onPause() {
        super.onPause();

        if (imagePath != null) {
            Log.i("myApp", "onPause");
            file imgToDelete = new file(imagePath);
            imgToDelete.delete();
        }
    }

    /**
     * Metodo que se ejecutara cada vez que se pulse un boton
     * Create un nuevo Intent con una URI distinta segun el boton que se pulse
     *
     * @param v
     */
    public void lanzarActivity(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.verWeb:
                i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com"));
                startActivity(Intent.createChooser(i, "Select web app"));
                break;
        }
    }
}
