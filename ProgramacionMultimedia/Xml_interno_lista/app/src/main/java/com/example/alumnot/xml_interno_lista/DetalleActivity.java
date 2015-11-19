package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class DetalleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView nameField = (TextView) findViewById(R.id.name_field);
        TextView platformField = (TextView) findViewById(R.id.platform_field);
        TextView yearField = (TextView) findViewById(R.id.year_field);
        Bundle extras = getIntent().getExtras();

        Videogame currentVideogame = (Videogame) extras.getSerializable("videogames");
        nameField.setText(currentVideogame.getNameText());
        platformField.setText(currentVideogame.getPlatform());
        yearField.setText(currentVideogame.getYear());
    }
}
