package Ejercicio1;

import java.util.HashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import Ejercicio1.Metodos;
import Herramientas.herramientas;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Alumnot
 */
public class Ejercicio1 {

    public static void main(String args[]) {

        // Cogemos la ruta donde se almacena el fichero
        Path path = Paths.get("C:\\Users\\Alumnot\\Documents\\personas.obj");

        // Si existe, se muestra, sino, lo creamos
        if (Files.exists(path)) {
            try {
                // Cogemos la ruta
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Alumnot\\Documents\\personas.obj"));
                // La leemos
                herramientas.leerMap(ois);
            } catch (ClassNotFoundException c) {
                System.out.println("Error tipo ClassNotFoundException: " + c);
            } catch (IOException e) {
                System.out.println("Error tipo IOException: " + e);
            }
        } else {
            // Creamos 3 personas
            Persona per1 = new Persona();
            Persona per2 = new Persona();

            try {
                // Llamamos al metodo para crear los datos de las personas
                Metodos.setPersonaDatos(per1);
                Metodos.setPersonaDatos(per2);

                // Creamos un HashMap
                HashMap map = new HashMap();

                // Metemos las personas en el HashMap, conel DNI por clave
                map.put(per1.getDNI(), per1);
                map.put(per2.getDNI(), per2);

                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Alumnot\\Documents\\personas.obj"));

                herramientas.escribirMap(oos, map);
            } catch (IOException e) {
                System.out.println("Error tipo IOException: " + e);
            }
        }
    }
}
