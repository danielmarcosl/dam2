package com.alumnot.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        // Cogemos el paquete del intent.
        SharedPreferences preferences=getSharedPreferences("Preferencias", Context.MODE_PRIVATE);

        // Creamos las variables donde introduciremos los datos.
        TextView usuario=(TextView) findViewById(R.id.usuarioA2);
        TextView contraseña=(TextView) findViewById(R.id.contraseñaA2);

        // Escribiremos el texto en cada textView del paquete.
        usuario.setText(preferences.getString("user","No encontrado"));
        contraseña.setText(preferences.getString("pass","No encontrado"));
    }
}
