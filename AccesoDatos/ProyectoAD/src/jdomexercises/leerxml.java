package jdomexercises;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import java.io.FileNotFoundException;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class leerxml {

    public static void main(String args[]) throws FileNotFoundException, JDOMException, IOException {
 
        // Abrimos el fichero con saxbuilder
        Document doc = new SAXBuilder().build("C:\\petra\\futbol.xml");
        
        // Cogemos el elemento root
        Element root = doc.getRootElement();

        // Imprimimos el atributo de root
        System.out.println(root.getAttributeValue("tipo"));

        // Creamos un list con el hijo de root
        List equipo = root.getChildren("equipo");

        // Lo iteramos
        Iterator i = equipo.iterator();

        while (i.hasNext()) {
            Element e = (Element) i.next(); // Recorremos el iterator y cogemos los elements
            Element club = e.getChild("club"); // Cogemos el hijo club
            Element presidente = e.getChild("presidente"); // Cogemos el hijo presidente

            System.out.println(club.getName() + " " + club.getText()
                    + ", valoracion " + club.getAttributeValue("valoracion")
                    + ", ciudad " + club.getAttributeValue("ciudad"));
            System.out.println(presidente.getName() + " " + presidente.getText());

            List plantilla = e.getChildren("plantilla"); // Cogemos el hijo plantilla y lo metemos en otra list

            // Iteramos la lista
            Iterator i2 = plantilla.iterator();

            while (i2.hasNext()) {
                Element p = (Element) i2.next(); // La recorremos y cogemos los elementos
                List nombre = p.getChildren("nombre"); // Hacemos una lista con la etiqueta nombre, ya que hay varios

                // Iteramos la lista
                Iterator i3 = nombre.iterator();

                while (i3.hasNext()) {
                    Element n = (Element) i3.next(); // Cogemos cada elemento
                    System.out.println(n.getText()); // Imprimimos el texto que contienen
                }
            }
        }
        
        // Metemos el elemento arbitro en una lista
        List arbitro = root.getChildren("arbitros");
        
        // La iteramos
        Iterator i4 = arbitro.iterator();
        
        while (i4.hasNext()) {
            Element arb = (Element) i4.next();
            
            // Metemos el elemento nombre en una lista ya que hay varios
            List nom = arb.getChildren("nombre");
            
            // Lo iteramos
            Iterator i5 = nom.iterator();
            
            while (i5.hasNext()) {
                Element n1 = (Element) i5.next();
                Element n2 = (Element) i5.next();
                
                // Mostramos los nombre de arbitro
                System.out.println("Arbitro 1 " + n1.getText());
                System.out.println("Arbitro 2 " + n2.getText());
            }
        }
    }
}
