package jdomexercises;

import java.io.FileInputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class LeerRaiz {

    public static void main(String args[]) {

        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new FileInputStream("C:\\Users\\Alumnot\\Documents\\ej1.xml"));

            // Leer la raiz
            Element root = doc.getRootElement(); // Devuelve la raíz
            System.out.println(root.getName());
            System.out.println(root.getAttributeValue("Nombre"));
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
