package chat;

import java.io.*;
import java.net.*;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Server {
    
    public static String nombres[];
    
    private static int N = 4;
    private static int puerto = 1027;
    private static String ip = "192.168.35.185";

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
