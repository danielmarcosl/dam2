package Ejercicio2;

import Herramientas.herramientas;
import java.io.IOException;
import java.util.HashMap;
/**
 *
 * @author Alumnot
 */
public class Ejercicio2 {

    public static void main (String args[]) throws IOException, ClassNotFoundException {
        Libreria lib1 = new Libreria();
        Libreria lib2 = new Libreria();
        Libreria lib3 = new Libreria();
        Libreria lib4 = new Libreria();
        Libreria lib5 = new Libreria();
        
        lib1.nuevaLibreria("El nombre del viento", "Alguien", "EditorialDefault", 1234);
        lib2.nuevaLibreria("SAO: Aincraf", "Akihiko", "Jp novels", 456);
        lib3.nuevaLibreria("Libro 3: por ejemplo", "Example", "EnglishTeacher", 51231);
        lib4.nuevaLibreria("Serializacion", "Serializador", "Serial Editors", 111);
        lib5.nuevaLibreria("Libro 4: asfasd", "Alguien", "K-Analla", 8934);
        
        HashMap<Integer,String> mapa = new HashMap<Integer,String>();
        
        herramientas.serializarObject(lib1, "C:\\Users\\Alumnot\\Documents\\fich.obj");
        
        mapa.put((Integer) herramientas.deserializarObject("C:\\Users\\Alumnot\\Documents\\fich.obj"), "hola");
        
        System.out.println(mapa.keySet());
    }
    
}
