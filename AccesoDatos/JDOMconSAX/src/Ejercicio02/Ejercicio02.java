package Ejercicio02;

import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio02 {

    public static void main(String args[]) {
        Element tienda = new Element("Tienda");
        tienda.setAttribute("Nombre", "Tienda para geeks");
        tienda.setAttribute("Ubicacion", "Tokio, Japon");

        Element computadora = new Element("Computadora");
        computadora.setAttribute("Nombre", "iBook");
        computadora.setAttribute("Precio", "$1200");

        Element historieta = new Element("Historieta");
        historieta.setAttribute("Nombre", "Dragon Ball Volumen 1");
        historieta.setAttribute("Precio", "$9");

        Element nivel = new Element("Nivel");
        nivel.setAttribute("Precio", "Sin precio");

        Element tipo = new Element("Tipo");
        tipo.addContent(computadora);
        tipo.addContent(historieta);
        tipo.addContent(nivel);
        tienda.addContent(tipo);

        Element computadora1 = new Element("Computadora");
        computadora1.setAttribute("Nombre", "PC");
        computadora1.setAttribute("Precio", "$1400");

        Element historieta1 = new Element("Historieta");
        historieta1.setAttribute("Nombre", "Naruto");
        historieta1.setAttribute("Precio", "$15");

        Element nivel1 = new Element("Nivel");
        nivel1.setAttribute("Precio", "Oscila");

        Element tipo1 = new Element("Tipo");
        tipo1.addContent(computadora1);
        tipo1.addContent(historieta1);
        tipo1.addContent(nivel1);
        tienda.addContent(tipo1);

        Document doc = new Document(tienda);

        XMLOutputter salida = new XMLOutputter();

        try {
            salida.output(doc, System.out);
            salida.output(doc, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\ej2.xml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
