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

public class MainActivity extends Activity{
    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    private ArrayList<String> listaTitulos = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            parsearXML();
            montarListView();
        }catch (XmlPullParserException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private void parsearXML() throws XmlPullParserException , IOException{
        XmlPullParser parser = getResources().getXml(R.xml.productos);
        int evenType = -1;

        while(evenType != XmlResourceParser.END_DOCUMENT){
            evenType = parser.next();
            if(evenType ==XmlResourceParser.START_TAG){
                String currentTagName = parser.getName();
                if(currentTagName.equals("producto")){
                    String nombreValue = parser.getAttributeValue(null, "nombre");
                    String precioValue = parser.getAttributeValue(null, "precio");
                    String descripcionValue = parser.getAttributeValue(null, "descripcion");

                    Producto productoActual = new Producto(nombreValue, precioValue, descripcionValue);

                    listaProductos.add(productoActual);
                    listaTitulos.add(nombreValue);
                }
            }
        }
    }

    private void montarListView(){
        ListView listView = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item,listaTitulos);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, DetalleActivity.class);

                i.putExtra("objetoProducto",listaProductos.get(position));
                startActivity(i);
            }
        });
    }
}










