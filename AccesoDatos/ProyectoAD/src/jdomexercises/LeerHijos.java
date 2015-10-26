/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdomexercises;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class LeerHijos {

    public static void main(String args[]) {

        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new FileInputStream("C:\\Users\\Alumnot\\Documents\\ej1.xml"));

            // Leer la raiz
            Element root = doc.getRootElement(); // Devuelve la raíz
            System.out.println(root.getName()
                    + ", Nombre: " + root.getAttributeValue("Nombre")
                    + ", Ubicacion: " + root.getAttributeValue("Ubicacion"));

            // Creamos una lista que contendra los hijos de root
            List<Element> t = root.getChildren("Tipo");

            // Si hubiera otro hijo habría que ahcer otro getChildren()
            Iterator it = t.iterator();

            while (it.hasNext()) {
                Element e = (Element) it.next();
                
                Element c = e.getChild("Computadora");
                System.out.println(c.getName()
                        + ", Nombre: " + c.getAttributeValue("Nombre")
                        + ", Precio: " + c.getAttributeValue("Precio"));

                c = e.getChild("Historieta");
                System.out.println(c.getName()
                        + ", Nombre: " + c.getAttributeValue("Nombre")
                        + ", Precio: " + c.getAttributeValue("Precio"));

                c = e.getChild("Nivel");
                System.out.println(c.getName()
                        + ", Nombre: " + c.getAttributeValue("Nombre"));
            }
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
