package calculadora;

import java.awt.Button;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 23/10/2015
 */
public class Metodos extends Calculadora {

    /**
     * Metodo del boton de sumar
     */
    public static void suma() {
        operacion = bSuma.getLabel();
        System.out.println(operacion);

        estadoA = false;
        estadoB = true;

        texto_pantalla.setText(numeroA + " " + operacion);
    }

    /**
     * Metodo del boton de restar
     */
    public static void resta() {
        operacion = bResta.getLabel();

        estadoA = false;
        estadoB = true;

        texto_pantalla.setText(numeroA + " " + operacion);
    }

    /**
     * Metodo del boton de dividir
     */
    public static void division() {
        operacion = bDivi.getLabel();

        estadoA = false;
        estadoB = true;

        texto_pantalla.setText(numeroA + " " + operacion);
    }

    /**
     * Metodo del boton de multiplicar
     */
    public static void multiplicacion() {
        operacion = bMulti.getLabel();

        estadoA = false;
        estadoB = true;

        texto_pantalla.setText(numeroA + " " + operacion);
    }

    /**
     * Metodo del boton resolver Ejecuta el tipo de operacion seleccionada Si no
     * se ha seleccionado ninguna operacion, no hace nada
     */
    public static void resolver() {
        switch (operacion) {
            case "+":
                texto_pantalla.setText(String.valueOf(Double.parseDouble(numeroA)
                        + Double.parseDouble(numeroB)));
                break;
            case "-":
                texto_pantalla.setText(String.valueOf(Double.parseDouble(numeroA)
                        - Double.parseDouble(numeroB)));
                break;
            case "*":
                texto_pantalla.setText(String.valueOf(Double.parseDouble(numeroA)
                        * Double.parseDouble(numeroB)));
                break;
            case "/":
                texto_pantalla.setText(String.valueOf(Double.parseDouble(numeroA)
                        / Double.parseDouble(numeroB)));
                break;
        }

        if (operacion != null) {
            estadoA = true;
            estadoB = false;

            numeroA = "";
            numeroB = "";
            operacion = null;
        }
    }

    /**
     * Metodo del boton borrar Vacia todas las variables Deja los booleanos en
     * su estado inicial
     */
    public static void borrar() {
        estadoA = true;
        estadoB = false;

        numeroA = "";
        numeroB = "";
        operacion = "";

        texto_pantalla.setText("");
    }

    /**
     * Metodo de los botones numericos Anade el numero a la variable
     * correspondiente
     *
     * @param numero Boton numerico pulsado
     */
    public static void botonNumero(Button numero) {

        if (estadoA) {
            numeroA += numero.getLabel();
            texto_pantalla.setText(numeroA);
        }

        if (estadoB) {
            numeroB += numero.getLabel();
            texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
        }
    }
}
