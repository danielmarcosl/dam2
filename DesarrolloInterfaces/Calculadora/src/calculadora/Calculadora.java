package calculadora;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 23/10/2015
 */
public class Calculadora extends Frame implements ActionListener {

    // Declaracion de botones
    public static Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
            bSuma, bResta, bMulti, bDivi, bIgual, bCero;

    // ArrayList que contendra todos los botones
    public static ArrayList<Button> botones = new ArrayList<Button>();

    // Variables de objetos de la vista
    public static TextArea texto_pantalla = new TextArea();

    // Variables modelo de datos
    public static String numeroA = "";
    public static String numeroB = "";
    public static String operacion = "";

    // Variables de la lógica
    public static boolean estadoA = true;
    public static boolean estadoB = false;

    /**
     * Constructor
     */
    public Calculadora() {
        setTitle("Calculeitor"); // Titulo de la ventana
        setLayout(new FlowLayout()); // Tipo de layout FlowLayout
        setSize(175, 360); // Tamano 175 x 320
        setResizable(false); // Hace que no se pueda cambiar el tamano
        setVisible(true); // Aplica visibilidad

        Dimension numberDimension = new Dimension(45, 40);
        Dimension igualDimension = new Dimension(145, 40);

        // Creamos los botones
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        bSuma = new Button("+");
        bResta = new Button("-");
        bMulti = new Button("*");
        bDivi = new Button("/");
        bCero = new Button("C");
        bIgual = new Button("=");

        // Anadimos los botones al ArrayList
        botones.add(b1);
        botones.add(b2);
        botones.add(b3);
        botones.add(b4);
        botones.add(b5);
        botones.add(b6);
        botones.add(b7);
        botones.add(b8);
        botones.add(b9);
        botones.add(bSuma);
        botones.add(b0);
        botones.add(bResta);
        botones.add(bDivi);
        botones.add(bMulti);
        botones.add(bCero);
        botones.add(bIgual);

        // Asignamos el tamano a los botones
        for (int i = 0; i < (botones.size() - 1); i++) {
            botones.get(i).setPreferredSize(numberDimension);
        }
        texto_pantalla.setPreferredSize(igualDimension);
        bIgual.setPreferredSize(igualDimension);

        // Anadimos listeners a los botones
        for (int i = 0; i < botones.size(); i++) {
            botones.get(i).addActionListener(this);
        }
        // Anadimos un listener al boton de cerrar
        addWindowListener(new CerrarVentana());

        // Anadimos el campo de texto
        add(texto_pantalla);
        
        // Anadimos los botones
        for (int i = 0; i < botones.size(); i++) {
            add(botones.get(i));
        }
    }

    /**
     * Metodo que recoge las pulsaciones de los botones y ejecuta una accion
     * dependiendo de cual sea pulsado
     *
     * @param e Boton pulsado
     */
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bSuma) { // Boton suma
            Metodos.suma();
        } else if (e.getSource() == bResta) { // Boton resta
            Metodos.resta();
        } else if (e.getSource() == bDivi) { // Boton division
            Metodos.division();
        } else if (e.getSource() == bMulti) { // Boton multiplicacion
            Metodos.multiplicacion();
        } else if (e.getSource() == bIgual) { // Boton resolver
            Metodos.resolver();
        } else if (e.getSource() == bCero) { // Boton Borrar
            Metodos.borrar();
        } else if (e.getSource() == b0) { // Boton 0
            Metodos.botonNumero(b0);
        } else if (e.getSource() == b1) { // Boton 1
            Metodos.botonNumero(b1);
        } else if (e.getSource() == b2) { // Boton 2
            Metodos.botonNumero(b2);
        } else if (e.getSource() == b3) { // Boton 3
            Metodos.botonNumero(b3);
        } else if (e.getSource() == b4) { // Boton 4
            Metodos.botonNumero(b4);
        } else if (e.getSource() == b5) { // Boton 5
            Metodos.botonNumero(b5);
        } else if (e.getSource() == b6) { // Boton 6
            Metodos.botonNumero(b6);
        } else if (e.getSource() == b7) { // Boton 7
            Metodos.botonNumero(b7);
        } else if (e.getSource() == b8) { // Boton 8
            Metodos.botonNumero(b8);
        } else if (e.getSource() == b9) { // Boton 9
            Metodos.botonNumero(b9);
        }
    }

    /**
     * Metodo principal que llama al constructor y muestra la ventana creada
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Calculadora(); // Invocamos al constructor
    }
}
