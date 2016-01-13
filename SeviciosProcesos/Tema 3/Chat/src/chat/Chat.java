package chat;

import java.io.*;
import java.net.*;

public class Chat {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(); //nuevo socket servidor

            // Realizando bind
            InetSocketAddress addr = new InetSocketAddress("192.168.35.185", 1027);
            serverSocket.bind(addr);

            // Aceptando conexiones
            Socket newSocket = serverSocket.accept();
            
            
            //Creando socket cliente
            Socket clientSocket = new Socket();

            //Estableciendo conexión
            InetSocketAddress addrCliente = new InetSocketAddress("192.168.35.186", 1027);
            clientSocket.connect(addrCliente);
            
            
            // Recibiendo mensaje
            InputStream is = newSocket.getInputStream();
            OutputStream os = clientSocket.getOutputStream();
            BufferedReader fentrada = new BufferedReader(new InputStreamReader(is));
            PrintWriter fsalida = new PrintWriter(os, true);
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));


            // Variable donde se almacenará el mensaje
            String mensajeCliente = "";
            String mensajeMio = "";

            while (!mensajeCliente.equals("cerrar") || !mensajeMio.equals("cerrar")) {
                mensajeCliente = fentrada.readLine();
                System.out.println("Gunto dice: " + mensajeCliente);
                
                System.out.print("Introduce argo: ");
                mensajeMio = teclado.readLine();
                fsalida.println(mensajeMio);
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