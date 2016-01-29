package chathilos;

import java.io.*;
import java.net.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Chat extends JFrame {

    public static int conexiones = 0;
    private static int maximas = 4;
    private static int puerto = 1027;
    private static String ip = "192.168.35.185";

    public static ServerSocket servidor;

    private JScrollPane scrollpanel;
    static JTextArea textarea;

    public Chat() {
        textarea = new JTextArea();
        scrollpanel = new JScrollPane(textarea);

        scrollpanel.setBounds(10, 10, 400, 400);
        add(scrollpanel);

        textarea.setEditable(false);
    }

    public static void main(String args[]) {
        try {
            // Socket servidor
            servidor = new ServerSocket();

            InetSocketAddress addr = new InetSocketAddress(ip, puerto);
            servidor.bind(addr);

            Chat pantalla = new Chat();
            pantalla.setBounds(0, 0, 420, 420);
            pantalla.setVisible(true);

            while (conexiones != maximas) {

                Socket socket = servidor.accept();

                conexiones += 1;
                
                HiloServidor h = new HiloServidor(socket);
                h.start();

                // Lanzamos el cliente
                Cliente cliente = new Cliente(ip, puerto);
                cliente.start();
            } // end bucle
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
