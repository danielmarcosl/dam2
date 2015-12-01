package Ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.Document;
import org.jdom2.Element;

import Herramientas.Herramientas;
/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio2 {
    
    public static void main(String args[]) {
        
        // Creamos un ArrayList para la primera comida
        ArrayList<Element> comida1 = new ArrayList<Element>();
        comida1.add(new Element("Nombre").setText("Waffles"));
        comida1.add(new Element("Precio").setText("$2.00"));
        comida1.add(new Element("Descripcion").setText("Waffles baratos de McDonald's"));
        comida1.add(new Element("Calorias").setText("650"));
        
        // Creamos un ArrayList para la segunda comida
        ArrayList<Element> comida2 = new ArrayList<Element>();
        comida2.add(new Element("Nombre").setText("Hamburguesa"));
        comida2.add(new Element("Precio").setText("$5.00"));
        comida2.add(new Element("Descripcion").setText("La hamburguesa mas comun de McDonald's"));
        comida2.add(new Element("Calorias").setText("1500"));
        
        // Cremos un ArrayList que contendra a los ArrayList anteriores
        ArrayList<ArrayList<Element>> comidaGlobal = new ArrayList<ArrayList<Element>>();
        comidaGlobal.add(comida1);
        comidaGlobal.add(comida2);
        
        // Creamos la etiqueta root menu
        Element menu = new Element("Menu_Almuerzo");
        
        // Creamos un ArrayList para los hijos de menu
        ArrayList<Element> comida = new ArrayList<Element>();
        comida.add(new Element("Comida"));
        comida.add(new Element("Comida"));
        
        // Creamos el arbol
        Herramientas.crearArbolNivel3(menu, comida, comidaGlobal);
        
        // Creamos un documento que contenga el arbol
        Document doc = new Document(menu);
        
        // Escribimos el fichero
        try{
            Herramientas.escribirFichero(doc,"menu");
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
