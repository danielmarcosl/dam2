package calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.xml.soap.Text;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 21/10/2015
 */
public class Calculadora extends Frame implements ActionListener {

    // Declaracion de botones
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bSuma, bResta, bMulti, bDivi, bIgual, bCero;

    // Variables modelo de datos
    private String numeroA = "";
    private String numeroB = "";
    private String operacion = "";

    // Variables de objetos de la vista
    private TextArea pantalla;

    // Variables de la lógica
    private boolean estadoA = true;
    private boolean estadoB = false;

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

        // Creamos vista de texto
        Label pantalla = new Label();
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
        pantalla.setPreferredSize(igualDimension);
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
        add(pantalla);
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

            pantalla.setText(numeroA + " " + operacion);
        } else if (e.getSource() == bResta) { // Boton resta
            operacion = bSuma.getName();

            estadoA = false;
            estadoB = true;

            pantalla.setText(numeroA + " " + operacion);
        } else if (e.getSource() == bDivi) { // Boton division
            operacion = bSuma.getName();

            estadoA = false;
            estadoB = true;

            pantalla.setText(numeroA + " " + operacion);
        } else if (e.getSource() == bMulti) { // Boton multiplicacion
            operacion = bSuma.getName();

            estadoA = false;
            estadoB = true;

            pantalla.setText(numeroA + " " + operacion);
        } else if (e.getSource() == bIgual) { // Boton resolver
            switch (operacion) {
                case "+":
                    pantalla.setText(String.valueOf(Double.parseDouble(numeroA)
                            + Double.parseDouble(numeroB)));
                    break;
                case "-":
                    pantalla.setText(String.valueOf(Double.parseDouble(numeroA)
                            - Double.parseDouble(numeroB)));
                    break;
                case "*":
                    pantalla.setText(String.valueOf(Double.parseDouble(numeroA)
                            * Double.parseDouble(numeroB)));
                    break;
                case "/":
                    pantalla.setText(String.valueOf(Double.parseDouble(numeroA)
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

            pantalla.setText("");
        } else if (e.getSource() == b0) { // Boton 0
            if (estadoA) {
                numeroA += b0.getLabel();
                pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b0.getLabel();
                pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b1) { // Boton 1
            if (estadoA) {
                numeroA += b1.getLabel();
                pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b1.getLabel();
                pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b2) { // Boton 2
            if (estadoA) {
                numeroA += b2.getLabel();
                pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b2.getLabel();
                pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
        } else if (e.getSource() == b2) { // Boton 2
            if (estadoA) {
                numeroA += b2.getLabel();
                pantalla.setText(numeroA);
            }

            if (estadoB) {
                numeroB += b2.getLabel();
                pantalla.setText(numeroA + " " + operacion + " " + numeroB);
            }
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
