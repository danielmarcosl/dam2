package com.ventisiete.joni.userpasstextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    public void logIn(View view)
    {
        EditText usuario=(EditText) findViewById(R.id.Usuario);
        EditText contrasena=(EditText) findViewById(R.id.Contr);

        String usuariotxt=usuario.getText().toString();
        String contrasenatxt=contrasena.getText().toString();

        TextView user=(TextView) findViewById(R.id.User);
        TextView contr=(TextView) findViewById(R.id.Pass);

        user.setText(usuariotxt);
        contr.setText(contrasenatxt);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
