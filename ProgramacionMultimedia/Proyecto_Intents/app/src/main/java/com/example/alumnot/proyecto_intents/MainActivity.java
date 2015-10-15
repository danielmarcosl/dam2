package com.example.alumnot.proyecto_intents;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Daniel Marcos Lorrio on 15/10/15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irActivityListIntents(View v) {
        Intent i = new Intent(this, ImplicitosActivity.class);
        startActivity(i);
    }
}
