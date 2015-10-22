package jdomexercises;

/**
 *
 * @author Daniel Marcos Lorrio
 */
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;
import java.io.*;

public class Libro {

    public static void main(String[] args) {

        // Creamos elemento
        Element root = new Element("Libro");
        // Anadimos atributo y valor
        root.setAttribute("isbn", "345E2");

        //Añadimos Hijos
        Element Titulo = new Element("Titulo");
        Titulo.setText("Mujercitas");
        root.addContent(Titulo);

        Element Precio = new Element("Precio");
        Precio.setText("3,50");
        root.addContent(Precio);

        // Creamos el documento
        Document doc = new Document(root);

        XMLOutputter salida = new XMLOutputter();

        try {
            salida.output(doc, System.out);
            salida.output(doc, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\lasRisas.xml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
