package chat;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Server {
    
    private static int N = 4;
    private static int puerto = 1027;
    private static String ip = "192.168.35.185";
    
    public static ArrayList<String> nombres = new ArrayList<String>();
    public static int clientesConectados = 0;
    
    public static void main(String args[]) {
        // Creacion de ventana
        new ServerWindow();

        try {
            // Socket servidor
            ServerSocket serverSocket = new ServerSocket();

            // Realizando bind
            InetSocketAddress addr = new InetSocketAddress(ip, puerto);
            serverSocket.bind(addr);

            while (N != 0) {
                N -= 1;
                Socket newSocket = serverSocket.accept();

                Sockets s = new Sockets(newSocket);
                s.start();
            }

            //cerrando el socket servidor
            serverSocket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
