package chat4hilos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Sockets extends Thread {

    private Socket socket;
    private int cliente;

    public Sockets(Socket s, int c) {
        this.socket = s;
        this.cliente = c;
    }

    public void run() {
        conexion();
    }

    private void conexion() {
        try {
            InputStream is = socket.getInputStream();
            BufferedReader fentrada = new BufferedReader(new InputStreamReader(is));
            String mensaje = fentrada.readLine();

            System.out.println("Cliente " + cliente + ": " + mensaje);

            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
