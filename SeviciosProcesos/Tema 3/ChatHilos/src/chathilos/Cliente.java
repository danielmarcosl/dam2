package chathilos;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Cliente extends Thread {

    // Declaración de socket

    Socket socket = null;
    // Array que contendra los mensajes
    ArrayList<String> mensajes;

    // Flujos de salida
    DataOutputStream fsalida;

    // Constructor, recibe el socket
    public Cliente(String ip, int puerto) throws IOException {
        socket = new Socket(ip, puerto);

        try {
            fsalida = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    } // end constructor

    // Agregar mensajes al array
    public void crearMensajes() {
        mensajes = new ArrayList<String>();
        mensajes.add("Hola es mi primerito dia");
        mensajes.add("Esto es un mensaje");
        mensajes.add("Victor, tienes que venir tu tambien");
        mensajes.add("Jaja saludos de la risa");
    }

    // El cliente envia los mensajes del array al servidor
    private void ejecutar() {

        //for (int i = 0; i < mensajes.size(); i++) {
            try {
                //fsalida.writeUTF(mensajes.get(i));
                fsalida.writeUTF("Esto es un mensaje");
                System.out.println("hola");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        //} // end bucle

        try {
            socket.close(); // Cerrar socket
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end ejecutar

    public void run() {
        ejecutar();
    } // end run
}// end Cliente
