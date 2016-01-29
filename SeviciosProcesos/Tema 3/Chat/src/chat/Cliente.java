package chat;

import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Cliente extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    Socket socket = null;
    // Preparar Streams
    DataInputStream fentrada; // Para mensajes de todos
    DataOutputStream fsalida; // Para escribir los mensajes
    String nombre;
    static JTextField mensaje = new JTextField();
    private JScrollPane scrollpanel;
    static JTextArea textarea1;
    JButton boton = new JButton("Enviar");
    JButton desconectar = new JButton("Salir");
    boolean repetir = true;

    // Constructor recibe el socket creado y el nombre del cliente
    public Cliente(Socket s, String n) {
        super("Conexion del cliente: " + n);
        setLayout(null);
        mensaje.setBounds(10, 10, 400, 30);
        add(mensaje);
        textarea1 = new JTextArea();
        scrollpanel = new JScrollPane(textarea1);
        scrollpanel.setBounds(10, 50, 400, 300);
        add(scrollpanel);
        boton.setBounds(420, 10, 100, 30);
        add(boton);
        desconectar.setBounds(420, 50, 100, 30);
        add(desconectar);
        textarea1.setEditable(false);
        boton.addActionListener(this);
        desconectar.addActionListener(this);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        socket = s;
        this.nombre = n;

        // Crear flujos de E/S
        try {
            fentrada = new DataInputStream(socket.getInputStream());
            fsalida = new DataOutputStream(socket.getOutputStream());
            String texto = " > Entra en el Chat ... " + nombre;
            fsalida.writeUTF(texto); // Escribe mensaje de entrada
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    } // end constructor

    // Al pulsar el boton enviar se envia al flujo de salida el mensaje escrito
    // Accion cuando se pulsan botones
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) { // Se pulsa el boton Enviar
            String texto = nombre + " > " + mensaje.getText();

            try {
                mensaje.setText(""); // Se limpia el area de mensaje
                fsalida.writeUTF(texto);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } // end if

        // Si se pulsa salir primero se envia mensaje de abandono de chat
        if (e.getSource() == desconectar) { // Se pulsa el boton salir
            String texto = " > Abandona el chat ..." + nombre;

            try {
                fsalida.writeUTF(texto);
                fsalida.writeUTF("*");
                repetir = false; // Para salir del bucle
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } // end if
    } // end actionPerformed

    // Metodo ejecutar, el cliente lee lo que le envia el hilo y lo muestra en textarea
    public void ejecutar() {
        String texto = "";
        while (repetir) {
            try {
                texto = fentrada.readUTF(); // Lee los mensajes
                textarea1.setText(texto); // Visualiza los mensajes
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Imposible conectar con el servidor\n" + e.getMessage(), "<<Mensaje de error:2>>",JOptionPane.ERROR_MESSAGE);
                repetir = false; // Salir del bucle
            }
        } // end bucle
        
        try {
            socket.close(); // Cerrar socket
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end ejecutar

    // En main se pide nombre de usuario, se realiza la conexion y se crea el objeto Cliente
    
    public static void main(String args[]) {
        int puerto = 1027;
        String nombre = JOptionPane.showInputDialog("Introduce tu nick: ");
        Socket s = null;
        
        try {
            s = new Socket("192.168.35.185",puerto);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Impsible conectar al servidor\n" + e.getMessage(), "<<Mensaje de error:1>>",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        if (!nombre.trim().equals("")) { // Hay que escribir algo
            Cliente cliente = new Cliente(s,nombre);
            cliente.setBounds(0,0,540,400);
            cliente.setVisible(true);
            cliente.ejecutar();
        } else {
            System.out.println("El nombre esta vacio ...");
        } // end if
    } // end main
}// end Cliente