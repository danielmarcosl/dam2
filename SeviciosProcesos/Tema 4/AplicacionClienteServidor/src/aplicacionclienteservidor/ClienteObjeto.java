package aplicacionclienteservidor;

import aplicacionclienteservidor.Persona;
import java.io.*;
import java.net.*;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class ClienteObjeto {
    
    public static void main (String args[]) {
        String Host = "192.168.35.23";
        int Puerto = 6000; // Puerto remoto
        
        System.out.println("Programa cliente iniciado...");
        
        try {
            Socket cliente = new Socket(Host,Puerto);
            
            // Flujo de entrada para objetos
            ObjectInputStream perEnt = new ObjectInputStream(cliente.getInputStream());
            
            // Se recibe un objeto
            Persona dato = (Persona) perEnt.readObject(); // Recibir objeto
            System.out.println("Recibo: " + dato.getNombre() + "*" + dato.getEdad());
            
            dato.setNombre("Juanito Maravilla");
            dato.setEdad(7);
            
            // Flujo de salida para objetos
            ObjectOutputStream perSal = new ObjectOutputStream(cliente.getOutputStream());
            
            // Envio del objeto
            perSal.writeObject(dato);
            System.out.println("Envio: " + dato.getNombre() + "*" + dato.getEdad());

            // Cerrar streams y sockets
            perEnt.close();
            perSal.close();
            
            cliente.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
