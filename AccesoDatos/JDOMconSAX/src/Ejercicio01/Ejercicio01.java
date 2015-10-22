package Ejercicio01;

import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio01 {

    public static void main(String args[]) {

        // Creamos Elementos y anadimos Atributos
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
        nivel.setAttribute("Precio", "sin precio");

        // Anadimos los Elementos hijos al padre
        tienda.addContent(computadora);
        tienda.addContent(historieta);
        tienda.addContent(nivel);

        // Creamos Documento
        Document doc = new Document(tienda);

        XMLOutputter salida = new XMLOutputter();

        try {
            salida.output(doc, System.out);
            salida.output(doc, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\ej1.xml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
