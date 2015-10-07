package com.example.alumnot.presentacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables modelo de datos
    private String numeroA = "";
    private String numeroB = "";
    private String operacion = "";

    // Variables de objetos de la vista
    private TextView campoPantalla;

    // Variables de la lógica
    private boolean estadoA = true;
    private boolean estadoB = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoPantalla = (TextView) findViewById(R.id.campoPantalla);
    }

    public void pulsaNumero(View v) {
        String teclaPulsada = String.valueOf(v.getTag());

        if (estadoA == true) {
            numeroA += teclaPulsada;
            campoPantalla.setText(numeroA);
        }
        if (estadoB == true) {
            numeroB += teclaPulsada;
            campoPantalla.setText(numeroA + " " + operacion + " " + numeroB);
        }
    }// end pulsaNumero

    /**
     * @param v
     */
    public void pulsaOperacion(View v) {
        int idPulsada = v.getId();

        switch (idPulsada) {
            case R.id.btnSumar:
                operacion = "+";
                break;
            case R.id.btnRestar:
                operacion = "-";
                break;
            case R.id.btnMultiplicar:
                operacion = "x";
                break;
            case R.id.btnDividir:
                operacion = "/";
                break;
        }

        estadoA = false;
        estadoB = true;

        campoPantalla.setText(numeroA + " " + operacion);
    }// end pulsaOperacion

    public void pulsaResolver(View v) {
        switch (operacion) {
            case "+":
                campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) +
                        Double.parseDouble(numeroB)));
                break;
            case "-":
                campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) -
                        Double.parseDouble(numeroB)));
                break;
            case "x":
                campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) *
                        Double.parseDouble(numeroB)));
                break;
            case "/":
                campoPantalla.setText(String.valueOf(Double.parseDouble(numeroA) /
                        Double.parseDouble(numeroB)));
                break;
        }

        estadoA = true;
        estadoB = false;

        numeroA = "";
        numeroB = "";
        operacion = "";
    }
}
