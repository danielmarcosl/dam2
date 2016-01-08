package serversocketstream;

import java.io.*;
import java.net.*;

public class ClientSocketStream {

    public static void main(String[] args) {
        try {
            //Creando socket cliente
            Socket clientSocket = new Socket();

            //Estableciendo conexión
            InetSocketAddress addr = new InetSocketAddress("192.168.35.185", 1027);
            clientSocket.connect(addr);

            //enviando mensaje
            InputStream is = clientSocket.getInputStream();
            OutputStream os = clientSocket.getOutputStream();
            String mensaje = "";
            PrintWriter fsalida = new PrintWriter(os, true);
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            while (!mensaje.equals("cerrar")) {
                System.out.print("Introduce argo: ");
                mensaje = teclado.readLine();
                fsalida.println(mensaje);
            }

            //Mensaje eviado, ahora cierro el socket 
            clientSocket.close();
            fsalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
