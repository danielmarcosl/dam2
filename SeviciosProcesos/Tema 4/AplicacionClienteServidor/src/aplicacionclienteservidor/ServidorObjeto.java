package aplicacionclienteservidor;

import java.io.*;
import java.net.*;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class ServidorObjeto {

    public static void main(String args[]) {
        int numeroPuerto = 6000; // Puerto
        String ip = "195.168.1.2";
        try {
            ServerSocket servidor = new ServerSocket();
            // Realizando bind
            InetSocketAddress addr = new InetSocketAddress(ip, numeroPuerto);
            servidor.bind(addr);

            System.out.println("Esperando al cliente...");
            Socket cliente = servidor.accept();

            // Preparar el flujo de salida para objetos
            ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());

            // Preparar un objeto y enviarlo
            Persona per = new Persona("Juan", 20);
            outObjeto.writeObject(per); // Enviando objeto
            System.out.println("Envio: " + per.getNombre() + "*" + per.getEdad());
            
            // Obtener un stream para leer datos
            ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
            Persona dato = (Persona) inObjeto.readObject();
            System.out.println("Recibo: " + dato.getNombre() + "*" + dato.getEdad());
            
            // Cerrar streams y sockets
            outObjeto.close();
            inObjeto.close();
            
            cliente.close();
            servidor.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    } // end main
} // end class
