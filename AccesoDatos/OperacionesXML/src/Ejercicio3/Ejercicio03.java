package Ejercicio3;

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
public class Ejercicio03 {

    public static void main(String args[]) {

        // Leemos el XML y lo metemos en un document
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\ficha.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Creamos el elemento root
        Element root = doc.getRootElement();

        // Cogemos los hijos autor
        List<Element> autores = root.getChildren("autor");

        // Los iteramos
        Iterator i = autores.iterator();

        // Anadimos el atributo siglo=XXI a los que tengan el atributo tipo=cat1
        while (i.hasNext()) {
            Element autor = (Element) i.next();
            if (autor.getAttributeValue("tipo").equals("cat1")) {
                autor.setAttribute("siglo", "XXI");
            }
        }

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Volvemos a iterar
        Iterator i2 = autores.iterator();

        // Borramos los elementos direccion de cada elemento autor
        while (i2.hasNext()) {
            Element autor = (Element) i2.next();
            autor.removeContent(autor.getChild("direccion"));
        }

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Volvemos a iterar
        Iterator i3 = autores.iterator();

        // Anadimos un contador para saber el numero de cada autor
        int count = 1;

        // Anadimos dos etiquetas al primer y tercer autor
        while (i3.hasNext()) {
            Element autor = (Element) i3.next();
            if (count == 1 || count == 3) {
                autor.addContent(new Element("premio").setText("cervantes"));
                autor.addContent(new Element("pelicula").setText("alatriste"));
            }
            // Aumentamos el contador
            count++;
        }

        // Escribimos las modificaciones
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
