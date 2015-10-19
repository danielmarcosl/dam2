package testingawl;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 14/10/2015
 */
public class TestingAwl extends Frame implements ActionListener {

    // Declaracion de botones
    Button buttonAceptar, buttonCancelar, buttonSalir;

    /**
     * Constructor
     */
    public TestingAwl() {
        setTitle("Ventana con butones"); // Titulo de la ventana
        setLayout(new FlowLayout()); // Indica el tipo de layout, FlowLayout
        setSize(400, 100); // Establece el tamaño ancho/alto
        setVisible(true); // Aplica la visibilidad

        // Creamos los botones
        buttonAceptar = new Button("Aceptar");
        buttonCancelar = new Button("Cancelar");
        buttonSalir = new Button("Salir");

        // Aniadimos listener a los botones
        buttonAceptar.addActionListener(this);
        buttonCancelar.addActionListener(this);
        buttonSalir.addActionListener(this);

        // Aniadimos los botones y un listener al boton de cerrar
        add(buttonAceptar);
        add(buttonCancelar);
        add(buttonSalir);
        addWindowListener(new CerrarVentana());
    }

    /**
     * Metodo que recoge las pulsaciones de los botones y ejecuta una accion
     * dependiendo de cual sea pulsado
     *
     * @param e Boton pulsado
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonAceptar) {
            System.out.println("Gracias por pulsar el botón");
        } else if (e.getSource() == buttonCancelar) {
            System.out.println("Si desea cerrar la ventana pulse en Salir");
        } else if (e.getSource() == buttonSalir) {
            System.out.println("Aqui tampoco se cierra, pulsa la X");
        }
    }

    /**
     * Metodo principal que llama al constructor y muestra la ventana creada
     *
     * @param args No se usa
     */
    public static void main(String[] args) {
        new TestingAwl(); // Invocamos al constructor
    }
}
