/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author AlumnoT
 */
public class ClientWindow {

    private JFrame ventana = new JFrame();
    private String nombre = "Client Window";

    public static JTextArea clientText = new JTextArea();

    ClientWindow() {
        // Asignacion de valores de la ventana
        ventana.setName(nombre);
        ventana.setTitle(nombre);
        ventana.setSize(400, 400);
        ventana.setVisible(true);

        ventana.add(clientText);
    }
}
