package com.alumnot.customadapter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Declaracion de EditTexts
		final EditText campoUsuario = (EditText) findViewById(R.id.userin);
		final EditText campoPassword = (EditText) findViewById(R.id.passin);
		// Declaracion de Button
		Button miBoton = (Button) findViewById(R.id.button);

		// Cogemos le texto de los EditTexts y lo pasamos a la siguiente activity
		miBoton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent (MainActivity.this, SecondActivity.class);
				i.putExtra("usuario", campoUsuario.getText());
				i.putExtra("password", campoPassword.getText());
				startActivity(i);
			}
		});
	}
}