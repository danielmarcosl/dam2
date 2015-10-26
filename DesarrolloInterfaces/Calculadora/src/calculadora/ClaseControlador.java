package calculadora;

import static calculadora.ClaseVista.botones;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 3 26/10/2015
 */
public class ClaseControlador implements ActionListener {

    ClaseModelo objModelo = null;
    ClaseVista objVista = null;

    /**
     *
     * @param objVista Nuevo objeto ClaseVista
     * @param objModelo Nuevo objeto ClaseModelo
     */
    public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) {
        this.objModelo = objModelo;
        this.objVista = objVista;

        // Anadimos listeners a los botones
        for (int i = 0; i < objVista.botones.size(); i++) {
            objVista.botones.get(i).addActionListener(this);
        }
    }

    // Variables modelo de datos
    public static String numero1 = "";
    public static String numero2 = "";
    public static String operacion = "";

    // Variables de la lógica
    public static boolean estado = true;
    public static boolean resuelto = false;

    /**
     * Metodo que recoge las pulsaciones de los botones y ejecuta una accion
     * dependiendo de cual sea pulsado
     *
     * @param e Boton pulsado
     */
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == objVista.bSuma
                || e.getSource() == objVista.bResta
                || e.getSource() == objVista.bDivi
                || e.getSource() == objVista.bMulti) { // Botones de operacion

            // Almacena la operacion pulsada en su variable
            operacion = objModelo.botonOperacion(e.getSource());

            // Mostramos la operacion en la pantalla
            objVista.texto_pantalla.setText(numero1 + " " + operacion + " " + numero2);

            // Cambiamos el estado para que el siguiente numero 
            // se introduzca en la variable numero2
            estado = false;
        } else if (e.getSource() == objVista.bIgual) { // Boton resolver
            if (!estado) { // Si hay operacion operar
                numero1 = Float.toString(objModelo.resultado(numero1, numero2, operacion));
            }

            // Mostrar el resultado en la pantalla
            objVista.texto_pantalla.setText(numero1);

            // Reseteamos valores
            numero2 = "";
            operacion = "";
            resuelto = true;
        } else if (e.getSource() == objVista.bCero) { // Boton borrar
            // Limpiamos la pantalla
            objVista.texto_pantalla.setText("");

            // Reseteamos valores
            numero1 = "";
            numero2 = "";
            operacion = "";
            estado = true;
            resuelto = false;
        } else if (e.getSource() == objVista.b0
                || e.getSource() == objVista.b1
                || e.getSource() == objVista.b2
                || e.getSource() == objVista.b3
                || e.getSource() == objVista.b4
                || e.getSource() == objVista.b5
                || e.getSource() == objVista.b6
                || e.getSource() == objVista.b7
                || e.getSource() == objVista.b8
                || e.getSource() == objVista.b9) { // Botones numeros

            Button bnum = (Button) e.getSource();

            if (estado && !resuelto) {
                numero1 += bnum.getLabel();
                objVista.texto_pantalla.setText(numero1);
            } else if (!estado && operacion != "") {
                numero2 += bnum.getLabel();
                objVista.texto_pantalla.setText(numero1 + " " + operacion + " " + numero2);
            }
        }
    }
}
