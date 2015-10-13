package com.example.alumnot.practicaciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Daniel Marcos Lorrio on 13/10/15.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Introduce el menu. Aniade elementos a la action bar si existe
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

}
