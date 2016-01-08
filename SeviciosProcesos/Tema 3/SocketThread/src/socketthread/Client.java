package socketthread;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Daniel Marcos Lorrio
 */
class Client extends Thread {

    Socket socket = null;

    Client(Socket s) {
        this.socket = s;
    }

    public void run() {

        try {
            //Enviando mensaje
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            PrintWriter fsalida = new PrintWriter(os, true);

            String mensaje = "Este es el mensaje " + Server.count;
            fsalida.println(mensaje);

            Server.count += 1;

            //Mensaje eviado, ahora cierro el socket 
            socket.close();
            fsalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
