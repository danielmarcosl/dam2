package com.alumnot.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        //He tenido que crear el listener porque el onclick no funcionaba.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creacion del intent
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                //Creacion de variables para obtencion de datos.
                EditText user = (EditText) findViewById(R.id.userin);
                EditText pass = (EditText) findViewById(R.id.passin);
                SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();

                editor.putString("user", user.getText().toString());
                editor.putString("pass", pass.getText().toString());
                editor.commit();

                //Lanzamos intent.
                startActivity(intent);
            }
        });
    }
}
