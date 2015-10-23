package calculadora;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 21/10/2015
 */
public class Calculadora extends Frame implements ActionListener {

    // Declaracion de botones
    public static Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
            bSuma, bResta, bMulti, bDivi, bIgual, bCero;

    // Variables modelo de datos
    public static String numeroA = "";
    public static String numeroB = "";
    public static String operacion = "";

    // Variables de objetos de la vista
    public static TextArea texto_pantalla = new TextArea(1, 20);

    // Variables de la lógica
    public static boolean estadoA = true;
    public static boolean estadoB = false;

    /**
     * Constructor
     */
    public Calculadora() {
        setTitle("Calculeitor"); // Titulo de la ventana
        setLayout(new FlowLayout()); // Tipo de layout FlowLayout
        setSize(175, 380); // Tamano 175 x 320
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

        // Asignamos el tamano a los botones
        texto_pantalla.setPreferredSize(igualDimension);
        b0.setPreferredSize(numberDimension);
        b1.setPreferredSize(numberDimension);
        b2.setPreferredSize(numberDimension);
        b3.setPreferredSize(numberDimension);
        b4.setPreferredSize(numberDimension);
        b5.setPreferredSize(numberDimension);
        b6.setPreferredSize(numberDimension);
        b7.setPreferredSize(numberDimension);
        b8.setPreferredSize(numberDimension);
        b9.setPreferredSize(numberDimension);
        bSuma.setPreferredSize(numberDimension);
        bResta.setPreferredSize(numberDimension);
        bMulti.setPreferredSize(numberDimension);
        bDivi.setPreferredSize(numberDimension);
        bCero.setPreferredSize(numberDimension);
        bIgual.setPreferredSize(igualDimension);

        // Anadimos listeners a los botones
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bSuma.addActionListener(this);
        bResta.addActionListener(this);
        bMulti.addActionListener(this);
        bDivi.addActionListener(this);
        bCero.addActionListener(this);
        bIgual.addActionListener(this);
        // Anadimos un listener al boton de cerrar
        addWindowListener(new CerrarVentana());

        // Anadimos los botones
        add(texto_pantalla);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(bSuma);
        add(b0);
        add(bResta);
        add(bMulti);
        add(bDivi);
        add(bCero);
        add(bIgual);
    }

    /**
     * Metodo que recoge las pulsaciones de los botones y ejecuta una accion
     * dependiendo de cual sea pulsado
     *
     * @param e Boton pulsado
     */
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bSuma) { // Boton suma
            operacion = bSuma.getLabel();
            System.out.println(operacion);

            estadoA = false;
            estadoB = true;

            texto_pantalla.setText(numeroA + " " + operacion);
        } else if (e.getSource() == bResta) { // Boton resta
            operacion = bResta.getLabel();

            estadoA = false;
            estadoB = true;

            texto_pantalla.setText(numeroA + " " + operacion);
        } else if (e.getSource() == bDivi) { // Boton division
            operacion = bDivi.getLabel();

            estadoA = false;
            estadoB = true;

            texto_pantalla.setText(numeroA + " " + operacion);
        } else if (e.getSource() == bMulti) { // Boton multiplicacion
            operacion = bMulti.getLabel();

            estadoA = false;
            estadoB = true;

            texto_pantalla.setText(numeroA + " " + operacion);
        } else if (e.getSource() == bIgual) { // Boton resolver
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
        } else if (e.getSource() == bCero) { // Boton Borrar

            estadoA = true;
            estadoB = false;

            numeroA = "";
            numeroB = "";
            operacion = "";

            texto_pantalla.setText("");
        } else if (e.getSource() == b0) { // Boton 0
            if (estadoA) {
                numeroA += b0.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b0.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b1) { // Boton 1
            if (estadoA) {
                numeroA += b1.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b1.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b2) { // Boton 2
            if (estadoA) {
                numeroA += b2.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b2.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b3) { // Boton 3
            if (estadoA) {
                numeroA += b3.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b3.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b4) { // Boton 4
            if (estadoA) {
                numeroA += b4.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b4.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b5) { // Boton 5
            if (estadoA) {
                numeroA += b5.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b5.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b6) { // Boton 6
            if (estadoA) {
                numeroA += b6.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b6.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b7) { // Boton 7
            if (estadoA) {
                numeroA += b7.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b7.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b8) { // Boton 8
            if (estadoA) {
                numeroA += b8.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b8.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b9) { // Boton 9
            if (estadoA) {
                numeroA += b9.getLabel();
                texto_pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b9.getLabel();
                texto_pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
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
