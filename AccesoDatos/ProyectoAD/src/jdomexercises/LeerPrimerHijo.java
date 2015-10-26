package jdomexercises;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class LeerPrimerHijo {

    public static void main(String args[]) {

        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new FileInputStream("C:\\Users\\Alumnot\\Documents\\ej1.xml"));

            // Leer la raiz
            Element root = doc.getRootElement(); // Devuelve la raíz
            System.out.println(root.getName()
                    + " Nombre: " + root.getAttributeValue("Nombre")
                    + " Ubicacion: " + root.getAttributeValue("Ubicacion"));

            Element c = root.getChild("Computadora");
            System.out.println(c.getName()
                    + " Nombre: " + c.getAttributeValue("Nombre")
                    + " Precio: " + c.getAttributeValue("Precio"));

            c = root.getChild("Historieta");
            System.out.println(c.getName()
                    + " Nombre: " + c.getAttributeValue("Nombre")
                    + " Precio: " + c.getAttributeValue("Precio"));

            c = root.getChild("Nivel");
            System.out.println(c.getName()
                    + " Precio: " + c.getAttributeValue("Precio"));

        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
