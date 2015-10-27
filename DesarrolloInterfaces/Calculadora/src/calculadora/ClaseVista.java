package calculadora;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 4 27/10/2015
 */
public class ClaseVista extends Frame {

    // Declaracion de botones
    public static Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
            bSuma, bResta, bMulti, bDivi, bIgual, bCero;

    // ArrayList que contendra todos los botones
    public static ArrayList<Button> botones = new ArrayList<Button>();

    // Variables de objetos de la vista
    public static TextArea texto_pantalla = new TextArea();

    /**
     * Constructor
     */
    public ClaseVista() {
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

        // Anadimos el campo de texto
        add(texto_pantalla);

        // Anadimos los botones
        for (int i = 0; i < botones.size(); i++) {
            add(botones.get(i));
        }

        // Anadimos un listener al boton de cerrar
        addWindowListener(new CerrarVentana());
    }
}
