package com.golondrino.multipantalla;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class SecondActivity
		extends Activity {

	private TextView textNombre, textApellidos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		textNombre = (TextView) findViewById(R.id.textNombre);
		textApellidos = (TextView) findViewById(R.id.testApellido);
		
		String nombre = getIntent().getStringExtra("nombre");
		String apellidos = getIntent().getStringExtra("apellido");
		
		textNombre.setText(nombre);
		textApellidos.setText(apellidos);
		
	}


}
