package chat;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class ServerWindow {

    private JFrame ventana = new JFrame();
    private String nombre = "Server Window";

    public static JTextArea serverText = new JTextArea();

    ServerWindow() {
        // Asignacion de valores de la ventana
        ventana.setName(nombre);
        ventana.setTitle(nombre);
        ventana.setSize(400, 400);
        ventana.setVisible(true);

        ventana.add(serverText);
    }
}
