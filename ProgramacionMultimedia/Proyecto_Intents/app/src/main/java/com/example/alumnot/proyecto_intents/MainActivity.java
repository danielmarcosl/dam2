package com.example.alumnot.proyecto_intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	
	public void irActivityListIntents(View v){
		Intent i = new Intent(this,ImplicitosActivity.class);
		startActivity(i);
	}



}
