package chat4hilos;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author Daniel Marcos
 */
public class Cliente {

    static String ip = "192.168.35.185";
    static int puerto = 1027;

    public static void main(String args[]) {
        try {
            // Crear socket cliente
            Socket cliente = new Socket();

            // Establecer conexion
            InetSocketAddress addr = new InetSocketAddress(ip, puerto);
            cliente.connect(addr);

            InputStream is = cliente.getInputStream();
            OutputStream os = cliente.getOutputStream();

            PrintWriter fsalida = new PrintWriter(os, true);

            String mensaje = "mensaje jaja saludos";
            fsalida.println(mensaje);

            cliente.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
