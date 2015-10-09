package multihiloventanas;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 09/10/2015
 */
public class ventanas {

    private JFrame ventana = new JFrame();
    private TextArea texto_ventana = new TextArea();

    /**
     * Creacion de ventana de Windows
     * @param nombre 
     */
    ventanas(String nombre) {
        ventana.setName(nombre);
        ventana.setTitle(nombre);
        ventana.setSize(400, 400);
        ventana.setVisible(true);
        ventana.add(texto_ventana);
    }

    /**
     * 
     * @param cadena 
     */
    public void escribecadena(String cadena) {
        texto_ventana.setText(texto_ventana.getText() + cadena);
    }
}
