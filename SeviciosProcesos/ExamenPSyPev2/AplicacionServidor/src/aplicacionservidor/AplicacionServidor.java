package aplicacionservidor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class AplicacionServidor {

    static String ip = "192.168.35.185";
    static int puerto = 1027;
    static int max = 4;
    static ArrayList<Integer> sumaVentas = new ArrayList<Integer>();

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket();

            InetSocketAddress addr = new InetSocketAddress(ip, puerto);
            server.bind(addr);

            for (int i = 0; i < max; i++) {
                Socket nuevoSocket = server.accept();
                Thread t = new HiloServidor(nuevoSocket);
                t.start();
            }
            server.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
