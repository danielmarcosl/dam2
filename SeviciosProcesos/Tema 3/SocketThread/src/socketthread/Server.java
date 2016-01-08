package socketthread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Server {

    public static int count = 0;

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(); //nuevo socket servidor
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Realizando bind
        InetSocketAddress addr = new InetSocketAddress("192.168.35.185", 1027);
        try {
            serverSocket.bind(addr);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        while (true) {
            try {
                // Aceptando conexiones
                Socket newSocket = serverSocket.accept();

                // Recibiendo mensaje
                InputStream is = newSocket.getInputStream();
                OutputStream os = newSocket.getOutputStream();
                BufferedReader fentrada = new BufferedReader(new InputStreamReader(is));

                // Creamos el hilo cliente
                Thread t = new Client(newSocket);
                // Lanzamos el hilo
                t.start();

                // Variable donde se almacenara el mensaje
                String mensaje = "";

                mensaje = fentrada.readLine();
                System.out.println(mensaje);

                // cerrando el nuevo socket
                //newSocket.close();
                // cerrando el buffer
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
