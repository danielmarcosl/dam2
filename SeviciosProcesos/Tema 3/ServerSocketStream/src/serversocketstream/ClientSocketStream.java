package serversocketstream;

import java.io.*;
import java.net.*;

public class ClientSocketStream {

    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket(); //Creando socket cliente
            
            //Estableciendo conexión
            InetSocketAddress addr = new InetSocketAddress("localhost", 1027);
            clientSocket.connect(addr);
            
            //enviando mensaje
            InputStream is = clientSocket.getInputStream();
            OutputStream os = clientSocket.getOutputStream();
            String mensaje = "mensaje desde el cliente";
            os.write(mensaje.getBytes());
            
            //Mensaje eviado, ahora cierro el socket 
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
