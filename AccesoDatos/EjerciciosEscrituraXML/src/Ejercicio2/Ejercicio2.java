package Ejercicio2;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio2 {
    
    public static void main(String args[]) {
        // Creamos la etiqueta root menu <Menu Almuerzo></Menu Almuerzo>
        Element menu = new Element("Menu_Almuerzo");
        
        // Creamos la etiqueta comida <Comida></Comida>
        Element comida = new Element("Comida");
        // Creamos la etiqueta comida2 <Comida></Comida>
        Element comida2 = new Element("Comida");
        
        // Creamos la etiqueta nombre <Nombre></Nombre> y le anadimos un texto
        Element nombre = new Element("Nombre").setText("Waffles");
        // Creamos la etiqueta precio <Precio></Precio> y le anadimos un texto
        Element precio = new Element("Precio").setText("$2.00");
        // Creamos la etiqueta descripcion <Descripcion></Descripcion> y le anadimos un texto
        Element descripcion = new Element("Descripcion").setText("Waffles baratos de McDonald's");
        // Creamos la etiqueta calorias <Calorias></Calorias> y le anadimos un texto
        Element calorias = new Element("Calorias").setText("650");
                
        // Creamos la etiqueta nombre2 <Nombre></Nombre> y le anadimos un texto
        Element nombre2 = new Element("Nombre").setText("Hamburguesa");
        // Creamos la etiqueta precio2 <Precio></Precio> y le anadimos un texto
        Element precio2 = new Element("Precio").setText("$5.00");
        // Creamos la etiqueta descripcion2 <Descripcion></Descripcion> y le anadimos un texto
        Element descripcion2 = new Element("Descripcion").setText("La hamburguesa mas comun de McDonald-s");
        // Creamos la etiqueta calorias2 <Calorias></Calorias> y le anadimos un texto
        Element calorias2 = new Element("Calorias").setText("1500");
        
        // Creamos el arbol
        Metodos.anadirRootChild(comida, nombre, precio, descripcion, calorias);
        Metodos.anadirRootChild(comida2, nombre2, precio2, descripcion2, calorias2);
        Metodos.anadirRoot(menu, comida, comida2);
        
        // Creamos un documento que contenga el arbol
        Document doc = new Document(menu);
        
        // Escribimos el fichero
        try{
        Metodos.escribirFichero(doc);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
