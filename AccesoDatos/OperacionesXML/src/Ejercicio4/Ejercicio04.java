package Ejercicio4;

import Ejercicio1.Ejercicio01;
import Herramientas.Herramientas;
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
public class Ejercicio04 {

    public static void main(String args[]) {

        // Abrimos el fichero
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\menu.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Cogemos el elemento root
        Element root = doc.getRootElement();

        // Cogemos los hijos comida de root
        List<Element> comidas = root.getChildren("comida");

        // Los iteramos
        Iterator i = comidas.iterator();

        // Anadimos a los hijos comida la etiqueta extras con atributo postres caros
        while (i.hasNext()) {
            Element c = (Element) i.next();
            c.addContent(new Element("extras").setAttribute("postres", "caros"));
        }

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Volvemos a iterar
        Iterator i2 = comidas.iterator();

        // Anadimos la etiqueta Nombre1 a todos los hijos tipoplatos
        while (i2.hasNext()) {
            Element c = (Element) i2.next();

            // Cogemos los hijos tipoplatos de comidas
            List<Element> tipoplatos = c.getChildren("tipoplatos");

            // Los iteramos
            Iterator i21 = tipoplatos.iterator();

            // Anadimos la etiqueta Nombre1 a cada tipoplatos
            while (i21.hasNext()) {
                Element t = (Element) i21.next();
                t.addContent(new Element("Nombre1"));
            }
        }

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Creamos un contador para saber en que numero de etiqueta estamos
        int count = 1;

        // Volvemos a iterar
        Iterator i3 = comidas.iterator();

        // Anadimos textos a las etiquetas Nombre1
        while (i3.hasNext()) {
            Element c = (Element) i3.next();

            // Cogemos los hijos tipoplatos de comidas
            List<Element> tipoplatos = c.getChildren("tipoplatos");

            // Los iteramos
            Iterator i31 = tipoplatos.iterator();

            // Anadimos texto a las etiquetas Nombre1
            while (i31.hasNext()) {
                Element t = (Element) i31.next();
                switch (count) {
                    case 1:
                        t.getChild("Nombre1").setText("horchata");
                        break;
                    case 2:
                        t.getChild("Nombre1").setText("vino");
                        break;
                    case 3:
                        t.getChild("Nombre1").setText("cava");
                        break;
                }
                count++;
            }
        }

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Volvemos a iterar
        Iterator i4 = comidas.iterator();

        while (i4.hasNext()) {
            Element c = (Element) i4.next();

            // Cogemos los hijos tipoplatos de comidas
            List<Element> tipoplatos = c.getChildren("tipoplatos");

            // Los iteramos
            Iterator i41 = tipoplatos.iterator();

            // Anadimos texto a las etiquetas Nombre1
            while (i41.hasNext()) {
                Element t = (Element) i41.next();
                
                List<Element> nombres = t.getChildren("nombre");
                
                Iterator i42 = nombres.iterator();
                
                while(i42.hasNext()) {
                    Element n = (Element) i42.next();
                    
                    if(n.getText().equals("crema con nueces")) {
                        n.removeContent();
                    }
                }
            }
        }

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
