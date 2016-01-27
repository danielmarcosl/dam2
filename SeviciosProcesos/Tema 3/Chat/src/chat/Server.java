package chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Server extends JFrame implements ActionListener {

    private static int conexiones = 0;
    private static int maximas = 4;
    private static int puerto = 1027;
    private static String ip = "192.168.35.185";

    public static int activas = 0;
    public static ServerSocket servidor;

    public static ArrayList<String> nombres = new ArrayList<String>();
    public static int clientesConectados = 0;

    static JTextField mensaje = new JTextField("");
    static JTextField mensaje2 = new JTextField("");
    private JScrollPane scrollpanel;
    static JTextArea textarea;
    JButton salir = new JButton("Salir");

    public Server() {
        super("Ventana del servidor de CHAT");
        setLayout(null);
        mensaje.setBounds(10, 10, 400, 30);
        add(mensaje);
        mensaje.setEditable(false);

        mensaje2.setBounds(10, 348, 400, 30);
        add(mensaje2);
        mensaje2.setEditable(false);

        textarea = new JTextArea();
        scrollpanel = new JScrollPane(textarea);

        scrollpanel.setBounds(10, 50, 400, 300);
        add(scrollpanel);
        salir.setBounds(420, 10, 100, 30);
        add(salir);

        textarea.setEditable(false);
        
        salir.addActionListener(this);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public static void main(String args[]) {
        try {
            // Socket servidor
            servidor = new ServerSocket(puerto);

            Server pantalla = new Server();
            pantalla.setBounds(0, 0, 540, 400);
            pantalla.setVisible(true);
            mensaje.setText("Numero de conexiones actuales: " + 0);

            while (conexiones != maximas) {
                Socket s = servidor.accept();

                HiloServidor h = new HiloServidor(s);
                h.start();
                conexiones += 1;
                activas += 1;
            }

            servidor.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salir) {
            try {
                servidor.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        System.exit(0);
    }
}
