package Ejercicio2;

import java.util.ArrayList;
import org.jdom2.Element;
import java.io.IOException;
import org.jdom2.Document;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio02 {

    public static void main(String args[]) {

        // Creamos los hijos del primer ejemplo
        ArrayList<Element> ejemplo1 = new ArrayList<Element>();
        ejemplo1.add(new Element("contenido").setText("Primera liena del ejemplo 1"));
        ejemplo1.add(new Element("contenido").setText("Segunda liena del ejemplo 1"));
        ejemplo1.add(new Element("contenido").setText("Tercera liena del ejemplo 1"));

        // Creamos los hijos del segundo ejemplo
        ArrayList<Element> ejemplo2 = new ArrayList<Element>();
        ejemplo2.add(new Element("contenido").setText("Primera liena del ejemplo 2"));
        ejemplo2.add(new Element("contenido").setText("Segunda liena del ejemplo 2"));
        ejemplo2.add(new Element("contenido").setText("Tercera liena del ejemplo 2"));

        // Los anadimos a un ArrayList
        ArrayList<ArrayList<Element>> ejemplos = new ArrayList<ArrayList<Element>>();
        ejemplos.add(ejemplo1);
        ejemplos.add(ejemplo2);

        // Creamos los hijos de root
        ArrayList<Element> documento = new ArrayList<Element>();
        documento.add(new Element("ejemplo"));
        documento.add(new Element("ejemplo"));

        // Creamos al Element root
        Element root = new Element("documento");

        // Creamos el arbol
        Herramientas.crearArbolNivel3(root, documento, ejemplos);

        // Lo anadimos a un Document
        Document doc = new Document(root);

        // Lo creamos
        try {
            Herramientas.escribirFichero(doc, "completo2");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
