package aplicacionservidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class HiloServidor extends Thread {

    private Socket socket;

    public HiloServidor(Socket s) {
        this.socket = s;
    }

    public void run() {
        conexion();
    }

    private void conexion() {
        try {
            InputStream is = socket.getInputStream();
            BufferedReader fentrada = new BufferedReader(new InputStreamReader(is));

            int numCliente = Integer.parseInt(fentrada.readLine());

            if (!AplicacionServidor.sumaVentas.contains(numCliente)) {
                AplicacionServidor.sumaVentas.add(numCliente, 0);
            }

            String mensaje = "";

            while (!mensaje.equals("*")) {
                String dinero = fentrada.readLine();
                mensaje = fentrada.readLine().toString();

                int d = Integer.parseInt(dinero) + AplicacionServidor.sumaVentas.get(numCliente);

                AplicacionServidor.sumaVentas.add(numCliente, d);

                System.out.println("Servidor: Recibida venta del cliente" + numCliente
                        + ". Ventas acumuladas Cliente" + numCliente + ": "
                        + AplicacionServidor.sumaVentas.get(numCliente));

            }

            System.out.println("El cliente" + numCliente + " ha vendido "
                    + AplicacionServidor.sumaVentas.get(numCliente) + " euros.");

            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
