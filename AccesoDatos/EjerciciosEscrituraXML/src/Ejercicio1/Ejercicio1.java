package Ejercicio1;

import org.jdom2.Element;
import java.io.IOException;
import org.jdom2.Document;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio1 {

    public static void main(String args[]) {

        // Creamos la etiqueta root frutas <Frutas></Frutas>
        Element frutas = new Element("Frutas");
        
        // Creamos la etiqueta fruta <Fruta></Fruta>
        Element fruta = new Element("Fruta");
        // Creamos la etiqueta nombre <Nombre></Nombre>
        Element nombre = new Element("Nombre");
        // Anadimos un texto a la etiqueta nombre <Nombre></Nombre>
        nombre.setText("Cereza");

        // Creamos la etiqueta fruta2 <Fruta></Fruta>
        Element fruta2 = new Element("Fruta");
        // Creamos la etiqueta nombre2 <Nombre></Nombre>
        Element nombre2 = new Element("Nombre");
        // Anadimos un texto a la etiqueta nombre2 <Nombre></Nombre>
        nombre2.setText("Naranja");

        // Creamos el arbol
        Metodos.escribirArbol(frutas, fruta, fruta2, nombre, nombre2);

        // Creamos un documento que contenga al arbol
        Document doc = new Document(frutas);

        try {
            // Generamos el fichero xml
            Metodos.escribirFichero(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
