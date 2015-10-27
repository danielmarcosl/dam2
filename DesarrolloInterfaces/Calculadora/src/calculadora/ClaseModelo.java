package calculadora;

import java.awt.Button;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 4 27/10/2015
 */
public class ClaseModelo {

    /**
     * Metodo para cualquier boton de operacion
     *
     * @param button Boton de operacion pulsado
     * @return
     */
    public static String botonOperacion(Object button) {

        Button bOperacion = (Button) button;
        String operacion = bOperacion.getLabel();

        return operacion;
    }

    /**
     * Metodo para el boton de resolver
     *
     * @param n1 Primer numero
     * @param n2 Segundo numero
     * @param op Signo de operacion
     * @return Resultado de la operacion
     */
    public static float resultado(String n1, String n2, String op) {

        float resultado = 0;

        switch (op) {
            case "+":
                resultado = Float.parseFloat(n1) + Float.parseFloat(n2);
                break;
            case "-":
                resultado = Float.parseFloat(n1) - Float.parseFloat(n2);
                break;
            case "*":
                resultado = Float.parseFloat(n1) * Float.parseFloat(n2);
                break;
            case "/":
                resultado = Float.parseFloat(n1) / Float.parseFloat(n2);
                break;
        }
        return resultado;
    }
}
