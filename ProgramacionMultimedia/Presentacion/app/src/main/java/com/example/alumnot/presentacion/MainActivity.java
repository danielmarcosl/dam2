package com.example.alumnot.presentacion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * @author Daniel Marcos Lorrio
 * @version 1.7 14/10/2015 12:46 GMT+1
 */
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

    /**
     * Metodo onCreate, muestra el layout activity_main
     * Vincula el campo de texto con id campoPantalla con la variable campoOantalla
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoPantalla = (TextView) findViewById(R.id.campoPantalla);
    }// end onCreate

    /**
     * Metodo ejecutado al pulsar cualquier boton de numero
     * Anade el numero pulsado a la variable correspondiente y lo muestra en el campo de texto del layout
     *
     * @param v
     */
    public void pulsaNumero(View v) {
        String teclaPulsada = String.valueOf(v.getTag());

        if (estadoA) {
            numeroA += teclaPulsada;
            campoPantalla.setText(numeroA);
        }

        if (estadoB) {
            numeroB += teclaPulsada;
            campoPantalla.setText(numeroA + " " + operacion + " " + numeroB);
        }
    }// end pulsaNumero

    /**
     * Metodo ejecutado al pulsar cualquier boton de operacion
     * Anade la operacion pulsada a la variable operacion y la muestra en el campo de texto
     * Cambia los valores de los estados
     *
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

    /**
     * Metodo ejecutado al pulsar el boton de resolver
     * Ejecuta la operacion almacenada en la variable operacion y muestra el resultado en el campo de texto
     * Reinicializa las variables y los estados
     *
     * @param v
     */
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
    }// end pulsaResolver

    /**
     * Metodo ejecutado al pulsar el boton C
     * Reinizializa las variables y los estados
     *
     * @param v
     */
    public void pulsaC(View v) {
        estadoA = true;
        estadoB = false;

        numeroA = "";
        numeroB = "";
        operacion = "";

        campoPantalla.setText("");
    }// end pulsaC
}
