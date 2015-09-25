package com.tipcalculator;

import java.text.NumberFormat;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.util.Log;
import android.view.*;

public class MainActivity extends Activity {

    private TextView textView1;
    public static final String tag = "TipCalculator";

    @Override
    public void onCreate(Bundle SaveInstanceState) {
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.main);

        this.setTextView1((TextView) findViewById(R.id.textView1));
        final EditText mealpricefield = (EditText) findViewById(R.id.mealprice);
        final TextView answerfield = (TextView) findViewById(R.id.answer);
        final Button button = (Button) findViewById(R.id.calculate);

        // Creacion de listener para button
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                try {
                    Log.i(tag, "OnClick invoked"); // Mensaje al iniciar el listener al hacer click
                    // Se almacena el texto del campo mealprice en la variable mealprice
                    String mealprice = mealpricefield.getText().toString();
                    Log.i(tag, "mealprice is [" + mealprice + "]"); // Mensaje con la cantidad introducida
                    String answer = "";
                    // Variable float para modificar el precio
                    float fmp = 0.0F;
                    // Cogemos el formato de moneda 
                    NumberFormat nf = java.text.NumberFormat.getCurrencyInstance();
                    // Almacenamos el precio con el formato de moneda cogido anteriormente
                    fmp = nf.parse(mealprice).floatValue();
                    // Multiplicamos el precio para realizar la conversion
                    fmp *= 1.2;
                    Log.i(tag, "Total meal price (unformatted) is [" + fmp + "]"); // Menasje con la cantidad modificada
                    // Mostramos un mensaje con el precio final y la conversion hecha
                    answer = "Full Price, including 20% tip: " + nf.format(fmp);
                    answerfield.setText(answer);
                    Log.i(tag, "OnClick Complete"); // Mensaje al acabar el listener

                } catch (java.text.ParseException pe) {
                    Log.i(tag, "Parse exception caught"); // Mostrar texto de error si hay un error de conversion
                    answerfield.setText("Failed to Parse amount?");
                } catch (Exception e) {
                    Log.e(tag, "Failed to calculate Tip:" + e.getMessage()); // Mostrar texto de error si hay un error global
                    e.printStackTrace();
                    answerfield.setText(e.getMessage());
                }// end try
            }// end onClick

        });// end button listener
        final Button btnCero = (Button) findViewById(R.id.cero);
        
        // Creacion de listener para el boton de resetear la calculadora
        btnCero.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mealpricefield.setText("€"); // Reseteamos la moneda 
                answerfield.setText("Reset"); // En el campo answerfield mostrar el texto Reset
            }// end onclick
        });// end button listener

    }// end onCreate

    public void setTextView1(TextView textView1) {
        this.textView1 = textView1;
    }// end TextView
}