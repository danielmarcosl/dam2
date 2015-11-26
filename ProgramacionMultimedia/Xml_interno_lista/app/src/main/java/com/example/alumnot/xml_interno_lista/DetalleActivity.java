package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
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

        nameField.setText(currentVideogame.getNameText());
        platformField.setText(currentVideogame.getPlatform());
        yearField.setText(currentVideogame.getYear());
        descriptionField.setText(currentVideogame.getDescription());

        switch (currentVideogame.getNameText()) {
            case "The Legend of Zelda":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logotloz));
                //imageField.setImageDrawable(ContextCompat.getDrawable(null,R.drawable.logotloz));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondothelegendofzelda));
                break;
            case "Zelda II: The Adventure of Link":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logotheadventureoflink));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondoadventureoflink));
                break;
            case "The Legend of Zelda: A Link to the Past":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logoalinktothepast));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondoalinktothepast2));
                break;
            case "The Legend of Zelda: Link's Awakening":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logolinkawakening));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondolinkawakening));
                break;
            case "The Legend of Zelda: Ocarina of Time":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logoocarinaoftime));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondoocarinaoftime));
                break;
            case "The Legend of Zelda: Majora's Mask":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logomajorasmask));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondomajorasmask));
                break;
            case "The Legend of Zelda: Oracle of Ages":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logooracleofages));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondooracleofages));
                break;
            case "The Legend of Zelda: Oracle of Seasons":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logooracleofseasons));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondooracleofseasons));
                break;
            case "The Legend of Zelda: A Link to the Past Four Swords":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logoalinktothepastandfourswords));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondoalinktothepastandfourswords));
                break;
            case "The Legend of Zelda: The Wind Waker":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logowindwaker));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondowindwaker));
                break;
            case "The Legend of Zelda: Four Swords Adventures":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logofourswordsadventures));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondofourswordsadventures));
                break;
            case "The Legend of Zelda: The Minish Cap":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logominishcap));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondominishcap));
                break;
            case "The Legend of Zelda: Twilight Princess":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logotwilightprincess));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondotwilightprincess));
                break;
            case "The Legend of Zelda: Phantom Hourglass":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logophantomhourglass2));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondophantomhourglass));
                break;
            case "The Legend of Zelda: Spirit Tracks":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logospirittracks));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondospirittracks));
                break;
            case "The Legend of Zelda: Skyward Sword":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logoskywardsword2));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondoskywardsword));
                break;
            case "The Legend of Zelda: A Link Between Worlds":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logoalinkbetweenworlds));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondoalinkbetweenworlds));
                break;
            case "The Legend of Zelda: Tri Force Heroes":
                imageField.setImageDrawable(getResources().getDrawable(R.drawable.logotriforceheroes));
                layout.setBackgroundDrawable(getResources().getDrawable(R.drawable.fondotriforceheroes));
                break;
        }
    }
}
