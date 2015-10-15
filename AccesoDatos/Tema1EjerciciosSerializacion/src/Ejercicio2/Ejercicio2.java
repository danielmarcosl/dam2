package Ejercicio2;

import Herramientas.herramientas;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author Alumnot
 */
public class Ejercicio2 {

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        // Creamos librerias
        Libreria lib1 = new Libreria();
        Libreria lib2 = new Libreria();
        Libreria lib3 = new Libreria();
        Libreria lib4 = new Libreria();
        Libreria lib5 = new Libreria();

        // Les asignamos valores
        lib1.nuevaLibreria("El nombre del viento", "Alguien", "EditorialDefault", 1234);
        lib2.nuevaLibreria("SAO: Aincraf", "Akihiko", "Jp novels", 456);
        lib3.nuevaLibreria("Libro 3: por ejemplo", "Example", "EnglishTeacher", 51231);
        lib4.nuevaLibreria("Serializacion", "Serializador", "Serial Editors", 111);
        lib5.nuevaLibreria("Libro 4: asfasd", "Alguien", "K-Analla", 8934);

        // Cremos un HashMap
        HashMap<Integer, Object> mapa = new HashMap<Integer, Object>();

        // Serializamos las librerias en un objeto
        herramientas.serializarObject(lib1, "D:\\Libraries\\Documents\\fich.obj");

        // Deserializamos y aniadimos el objeto al HashMap, con el isbn como clave
        Libreria libre = (Libreria) herramientas.deserializarObject("D:\\Libraries\\Documents\\fich.obj");
        mapa.put(libre.getISBN(), libre);

        System.out.println(mapa.keySet());
    }

}
