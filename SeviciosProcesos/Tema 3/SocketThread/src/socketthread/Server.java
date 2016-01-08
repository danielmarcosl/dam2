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
        try {
            ServerSocket serverSocket = new ServerSocket(); //nuevo socket servidor

            // Realizando bind
            InetSocketAddress addr = new InetSocketAddress("192.168.35.185", 1027);
            serverSocket.bind(addr);

            while (count < 20) {
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

                // Variable donde se almacenará el mensaje
                String mensaje = "";

                mensaje = fentrada.readLine();
                System.out.println(mensaje);

                // cerrando el nuevo socket
                //newSocket.close();
                // cerrando el buffer
                t.join();
                fentrada.close();
            }

            //cerrando el socket servidor
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
