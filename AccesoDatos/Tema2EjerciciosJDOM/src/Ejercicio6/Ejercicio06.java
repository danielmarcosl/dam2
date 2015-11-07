package Ejercicio6;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio06 {

    public static void main(String args[]) {

        // Abrimos el documento
        Document doc = null;
        try {
            doc = new SAXBuilder().build("D:\\Libraries\\Documents\\completo6.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Cogemos el elemento root
        Element root = doc.getRootElement();

        System.out.println(root.getName());

        // Cogemos el hijo de root
        Element tabla = root.getChild("tabla");

        System.out.println(tabla.getName());

        // Cogemos los dos hijos de tabla
        List<Element> campo = tabla.getChildren("campo");

        // Los iteramos
        Iterator i = campo.iterator();

        // Mostramos sus hijos
        while (i.hasNext()) {
            Element c = (Element) i.next();

            System.out.println(c.getName());

            Element nombre = c.getChild("nombre");
            Element tipo = c.getChild("tipo");
            Element valor = c.getChild("valor");

            System.out.println(nombre.getName() + ": " + nombre.getText());
            System.out.println(tipo.getName() + ": " + tipo.getText());
            System.out.println(valor.getName() + ": " + valor.getText());
        }
    }
}
