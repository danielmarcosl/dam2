package Ejercicio7;

import org.jdom2.Document;
import org.jdom2.Element;
import java.io.IOException;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio07 {

    public static void main(String args[]) {

        // Creamos el elemento root
        Element root = new Element("MENU");

        // Creamos el hijo de root
        Element comida = new Element("COMIDA");

        // Creamos el hijo de comida
        Element plato = new Element("PLATO");

        // Creamos los hijos de plato
        Element nombre = new Element("NOMBRE").setText("Macarrones");
        Element ingredientes = new Element("INGREDIENTES").setText("Pasta, tomate y queso");

        // Alineamos las etiquetas
        plato.addContent(nombre);
        plato.addContent(ingredientes);
        comida.addContent(plato);
        root.addContent(comida);

        // Creamos el documento
        Document doc = new Document(root);

        // Anadimos una nueva etiqueta a plato llamada PRECIO
        plato.addContent(new Element("PRECIO").setText("5"));

        // Anadimos atributos a comida y nombre
        comida.setAttribute("menu", "diurno");
        nombre.setAttribute("calorias", "1500");

        // Cambiamos el nombre de nombre por plato principal
        nombre.setName("PLATO_PRINCIPAL");

        // Anadimos atributo a ingredientes
        ingredientes.setAttribute("cantidad", "al gusto");

        // Cambiamos el texto de plato principal
        nombre.setText("Gazpacho");

        // Escribimos el fichero
        try {
            Herramientas.escribirFichero(doc, "completo7");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
