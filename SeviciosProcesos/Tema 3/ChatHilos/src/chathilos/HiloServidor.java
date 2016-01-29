package chathilos;

import java.io.*;
import java.net.*;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class HiloServidor extends Thread {

    DataInputStream fentrada;
    Socket socket = null;

    public HiloServidor(Socket s) {
        socket = s;

        try {
            // Crear flujo de entrada
            fentrada = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end constructor

    public void run() {

        // bucle que recibe lo que el cliente escribe en el chat
        // al salir se le envia un * al servidor
        while (true) {
            String cadena = "";

            try {
                cadena = fentrada.readUTF(); // Lee lo que el cliente escribe
                Chat.textarea.append(cadena + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } // end bucle
    } // end run
} // end HiloServidor
