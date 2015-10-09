package SerializarMap;

import java.util.HashMap;
import Herramientas.herramientas;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alumnot
 */
public class list2 {

    public static void main(String args[]) {

        try {
            contacto con1 = new contacto();
            contacto con2 = new contacto();
            contacto con3 = new contacto();

            con1.nuevoContacto("JM", 288);
            con2.nuevoContacto("asdf", 251);
            con3.nuevoContacto("por ejemplo", 882);

            HashMap mapa = new HashMap();

            mapa.put(1, con1);
            mapa.put(2, con2);
            mapa.put(3, con3);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Alumnot\\Documents\\hash.obj"));

            herramientas.escribirMap(oos, mapa);

            oos.close();
        } catch (IOException e) {
            System.out.println("Error tipo IOException: " + e);
        }

        try {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Alumnot\\Documents\\hash.obj"));

        herramientas.leerMap(ois);
        
        } catch (ClassNotFoundException c) {
            System.out.println("Error tipo ClassNotFoundException: " + c);
        } catch (IOException e) {
            System.out.println("Error tipo IOException: " + e);
        }
    }
    // Generar n objetos
    // Crear hashMap para guardar objetos
    // Serializarlo modo escribirMap
    // Deserializarlo metodo leerMap
}
