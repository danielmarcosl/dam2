package serversocketstream;

import static com.sun.org.apache.xerces.internal.xinclude.XIncludeHandler.BUFFER_SIZE;
import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;

public class ServerSocketStream {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(); //nuevo socket servidor

            //Realizando bind
            InetSocketAddress addr = new InetSocketAddress("192.168.35.185", 1027);
            serverSocket.bind(addr);

            //Aceptando conexiones
            Socket newSocket = serverSocket.accept();

            //Recibiendo mensaje
            InputStream is = newSocket.getInputStream();
            OutputStream os = newSocket.getOutputStream();

            byte[] message = new byte[1024];
            String messageString = "";
            int num;
            boolean funcionando = true;

            //while ((num = is.read(message, 0, 1024)) != -1) {
            while(!messageString.equals("cerrar")) {
                messageString = null;
                message = new byte[1024];
                num = 0;
                
                is.read(message);
                
                String numStr = new String(message, 0, 1024);
                System.out.println(numStr);
                num = Integer.parseInt(numStr);
                
                System.out.println(num);
                is.read(message);
                messageString = new String(message, 0, num);
                System.out.println("Teniente dise: " + messageString);
            }
            //cerrando el nuevo socket
            newSocket.close();

            //cerrando el socket servidor
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
