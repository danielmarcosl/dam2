package jdomexercises;

import java.io.FileInputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class escribir {

    public static void main(String args[]) {

        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new FileInputStream("C:\\Users\\Alumnot\\Documents\\ej1.xml"));

            //Hacer una lectura
            new XMLOutputter().output(doc, System.out);
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
