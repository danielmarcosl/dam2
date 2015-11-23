package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class DetalleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.relativel);

        TextView nameField = (TextView) findViewById(R.id.name_field);
        TextView platformField = (TextView) findViewById(R.id.platform_field);
        TextView yearField = (TextView) findViewById(R.id.year_field);
        TextView descriptionField = (TextView) findViewById(R.id.description_field);

        ImageView imageField = (ImageView) findViewById(R.id.image_field);
        Bundle extras = getIntent().getExtras();

        Videogame currentVideogame = (Videogame) extras.getSerializable("videogames");

        nameField.setText("Name: " + currentVideogame.getNameText());
        platformField.setText("Platform: " + currentVideogame.getPlatform());
        yearField.setText("Release Date: " + currentVideogame.getYear());
        descriptionField.setText("Description: " + currentVideogame.getDescription());

        switch (currentVideogame.getNameText()) {
            case "The Legend of Zelda":
                //imageField.setImageDrawable(getResources().getDrawable(R.drawable.logo1));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondothelegendofzelda));
                break;
            case "Zelda II: The Adventure of Link":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logotheadventureoflink));
                break;
            case "The Legend of Zelda: A Link to the Past":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logoalinktothepast));
                break;
        }
    }
}
