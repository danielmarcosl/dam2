package com.example.alumnot.xml_interno_lista;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class DetalleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        TextView campoNombre = (TextView) findViewById(R.id.campo_nombre);
        TextView campoPrecio = (TextView) findViewById(R.id.campo_precio);
        TextView campoDescripcion = (TextView) findViewById(R.id.campo_descripcion);

        Producto productoActual = (Producto) getIntent().getParcelableExtra("objetoProducto");

        campoNombre.setText(productoActual.getNombre());
        campoPrecio.setText(productoActual.getPrecio());
        campoDescripcion.setText(productoActual.getDescripcion());
    }
}
