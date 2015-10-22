package jdomexercises;

import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Test1 {

    public static void main(String args[]) {
        // Creamos un elemento <Ejemplo></Ejemplo>
        Element root = new Element("Ejemplo");
        
        // Anadimos un texto al elemento
        root.setText("prueba por ejemplo");
        
        // Creamos un documento que incluya nuestro elemento
        Document doc = new Document(root);
        
        // Creamos una variable XMLOutputter
        XMLOutputter salida = new XMLOutputter();
        
        // Creamos el fichero desde la variable de XMLOutputter al enlace dado
        try {
            salida.output(doc,System.out);
            salida.output(doc,new FileOutputStream("C:\\Users\\Alumnot\\Documents\\lasRisas.xml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }        
    }
}
