package com.example.alumnot.practicaciclodevida;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * @author Daniel Marcos Lorrio
 * @version 1 13/10/15
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("myApp", "estado onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.i("myApp", "estado onStart");
        super.onRestart();
    }

    public void irActivity2(View v) {
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
    }

    protected void onRestart() {
        Log.i("myapp", "estado onRestart");
        super.onRestart();
    }

    // Ciclo de vida: Salida de la activity
    @Override
    protected void onPause() {
        Log.i("myApp", "estado onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i("myApp", "estado onDestroy");
        super.onDestroy();
    }
}
