package com.alumnot.customadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


    public class SecondActivity extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.second_activity);
            //Cogemos el paquete del intent.
            Bundle bundle = this.getIntent().getExtras();

            ArrayList<DatosUser> datos = new ArrayList<>();
            datos.add(new DatosUser(bundle.getString("usr").toString(), bundle.getString("pass").toString()));

            AdaptadorLista adaptadorLista = new AdaptadorLista(this.getApplicationContext(), datos);

            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adaptadorLista);
        }
    }
