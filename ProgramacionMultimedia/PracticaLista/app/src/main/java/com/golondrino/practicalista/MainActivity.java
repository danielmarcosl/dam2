package com.golondrino.practicalista;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> headerList = new ArrayList<String>();

    public void listar(View view)
    {
        // Declaramos ListView
        ListView listView = (ListView) findViewById(R.id.lista);
        // Declaramos EditTexts
        EditText tNombre = (EditText) findViewById(R.id.Nombre);
        EditText tApellido = (EditText) findViewById(R.id.Apellido);

        // Anadimos el texto de los EditText al ArrayList
        headerList.add(String.valueOf(tNombre.getText()));
        headerList.add(String.valueOf(tApellido.getText()));

        // Vaciar EditTexts
        tNombre.setText("");
        tApellido.setText("");

        // Linkear el ArrayList y el layout list_item a un ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, headerList);
        // Anadir el contenido del ArrayAdapter al ListView
        listView.setAdapter(adapter);
    }// end logIn

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }// end onCreate
}
