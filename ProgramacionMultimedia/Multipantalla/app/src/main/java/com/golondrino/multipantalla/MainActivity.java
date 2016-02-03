package com.golondrino.multipantalla;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity
		extends Activity {

	private EditText campoNombre, campoApellidos;
	private Button miBoton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		campoNombre = (EditText) findViewById(R.id.EditNombre);
		campoApellidos = (EditText) findViewById(R.id.EditApellidos);
		miBoton = (Button) findViewById(R.id.BotonPasar);
		
		miBoton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent (MainActivity.this, SecondActivity.class);
				i.putExtra("nombre", campoNombre.getText()+"");
				i.putExtra("apellido", campoApellidos.getText()+"");
				startActivity(i);
			}
		});
	}
}
