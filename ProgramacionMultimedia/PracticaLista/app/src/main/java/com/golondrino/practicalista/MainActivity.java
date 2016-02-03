package com.golondrino.practicalista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void logIn(View view)
    {
        EditText nombre = (EditText) findViewById(R.id.Nombre);
        EditText apellido = (EditText) findViewById(R.id.Apellido);

        ListView myListView = (ListView) findViewById(R.id.lista);
        ArrayList<String> myStringArray = new ArrayList<String>();
        myStringArray.add(nombre.getText().toString());
        myStringArray.add(apellido.getText().toString());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);


        Adapter adapter = new CustomAdapter(getActivity(), R.layout.row, myStringArray1);
        myListView.setAdapter(adapter);


        user.setText(usuariotxt);
        contr.setText(contrasenatxt);
    }// end logIn

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }// end onCreate
}
