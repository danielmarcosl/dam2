package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by AlumnoT on 05/11/2015.
 */
public class MainActivity extends Activity {
    private ArrayList<Videogame> videogamesList = new ArrayList<Videogame>();
    private ArrayList<String> headerList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //showListActivity();
    }

    public void showListActivity(View v) {
        Intent i = new Intent(this, ListActivity.class);
        startActivity(i);
    }
}
