package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Client {

    public static void main(String[] args) {

        new ClientWindow();

        try {
            //Creando socket cliente
            Socket clientSocket = new Socket();

            //Estableciendo conexión
            InetSocketAddress addr = new InetSocketAddress("192.168.35.185", 1027);
            clientSocket.connect(addr);

            // Buffer de salida
            OutputStream os = clientSocket.getOutputStream();
            PrintWriter fOut = new PrintWriter(os, true);

            // Buffer de entrada
            InputStream is = clientSocket.getInputStream();
            BufferedReader fIn = new BufferedReader(new InputStreamReader(is));

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            sendName(fOut, fIn, keyboard);

            String mensaje = "";

            while (!mensaje.equals("cerrar")) {
                System.out.print("Introduce argo: ");
                mensaje = keyboard.readLine();
                fOut.println(mensaje);
            }

            //Mensaje eviado, ahora cierro el socket 
            fOut.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 

    private static void sendName(PrintWriter fo, BufferedReader fi, BufferedReader kb) throws IOException {
        ClientWindow.clientText.setText((fi.readLine()));
        String name = kb.readLine(); // TODO in sockets
        ClientWindow.clientText.setText("Usuario " + name + " se ha conectado\n");
        fo.println(name);
    }
}
