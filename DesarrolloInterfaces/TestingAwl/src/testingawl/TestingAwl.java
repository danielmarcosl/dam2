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
    Button button1, button2, button3;

    /**
     * Constructor
     */
    public TestingAwl() {
        setTitle("Ventana con butones"); // Titulo de la ventana
        setLayout(new FlowLayout()); // Indica el tipo de layout, FlowLayout
        setSize(400, 100); // Establece el tamaño ancho/alto
        setVisible(true); // Aplica la visibilidad

        // Creamos los botones
        button1 = new Button("Aceptar");
        button2 = new Button("Cancelar");
        button3 = new Button("Salir");

        // Aniadimos listener a los botones
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // Aniadimos los botones y un listener al boton de cerrar
        add(button1);
        add(button2);
        add(button3);
        addWindowListener(new CerrarVentana());
    }

    /**
     * Metodo que recoge las pulsaciones de los botones y ejecuta una accion
     * dependiendo de cual sea pulsado
     *
     * @param e Boton pulsado
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println("Gracias por pulsar el botón");
        } else if (e.getSource() == button2) {
            System.out.println("Si desea cerrar la ventana pulse en Salir");
        } else if (e.getSource() == button3) {
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
