package serversocketstream;

import java.io.*;
import java.net.*;

public class ServerSocketStream {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(); //nuevo socket servidor

            // Realizando bind
            InetSocketAddress addr = new InetSocketAddress("192.168.35.185", 1027);
            serverSocket.bind(addr);

            // Aceptando conexiones
            Socket newSocket = serverSocket.accept();

            // Recibiendo mensaje
            InputStream is = newSocket.getInputStream();
            OutputStream os = newSocket.getOutputStream();
            BufferedReader fentrada = new BufferedReader(new InputStreamReader(is));

            // Variable donde se almacenará el mensaje
            String mensaje = "";

            while (!mensaje.equals("cerrar")) {
                mensaje = fentrada.readLine();
                System.out.println(mensaje);
            }
            // cerrando el nuevo socket
            newSocket.close();
            // cerrando el buffer
            fentrada.close();
            

            //cerrando el socket servidor
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
