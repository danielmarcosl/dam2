package aplicacioncliente;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Random;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class AplicacionCliente {

    static String ip = "192.168.35.185";
    static int puerto = 1027;
    static int ventas = 0;
    static int numCliente = 3; // Numero de cliente, cambiar ascendentemente

    public static void main(String args[]) {
        try {
            Socket cliente = new Socket();

            InetSocketAddress addr = new InetSocketAddress(ip, puerto);
            cliente.connect(addr);

            InputStream is = cliente.getInputStream();
            OutputStream os = cliente.getOutputStream();

            PrintWriter fsalida = new PrintWriter(os, true);

            String mensaje = "";
            fsalida.println(numCliente);

            while (mensaje != "*") {
                String num = String.valueOf(getNumero());
                mensaje = mensajeVentas();

                fsalida.println(num);
                fsalida.println(mensaje);

                System.out.println("Cliente" + numCliente
                        + ": Enviando venta: " + num + " euros.");

                sleep(2000);
            }

            cliente.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private static int getNumero() {
        Random rand = new Random();
        int num = rand.nextInt(150);
        return num;
    }

    private static String mensajeVentas() {
        String mensaje = "";

        if (ventas < 9) {
            ventas += 1;
            mensaje = String.valueOf(ventas);
        } else if (ventas >= 9) {
            mensaje = "*";
        }
        return mensaje;
    }
}
