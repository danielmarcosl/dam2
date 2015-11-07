package Ejercicio8;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio08 {

    public static void main(String args[]) {
        
        // Abrimos el documento
        Document doc = null;
        try {
            doc = new SAXBuilder().build("D:\\Libraries\\Documents\\completo7.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // Cogemos el elemento root
        Element root = doc.getRootElement();
        
        System.out.println(root.getName());
        
        // Cogemos el hijo de root
        Element comida = root.getChild("COMIDA");
        
        System.out.println(comida.getName() + ", menu " + comida.getAttributeValue("menu"));
        
        // Cogemos el hijo de comida
        Element plato = comida.getChild("PLATO");
        
        System.out.println(plato.getName());
        
        // Cogemos los hijos de plato
        Element platoPrincipal = plato.getChild("PLATO_PRINCIPAL");
        Element ingredientes = plato.getChild("INGREDIENTES");
        Element precio = plato.getChild("PRECIO");
        
        System.out.println(platoPrincipal.getName() +
                ", calorias " + platoPrincipal.getAttributeValue("calorias") + ": "
                + platoPrincipal.getText());
        System.out.println(ingredientes.getName() +
                ", cantidad " + ingredientes.getAttributeValue("cantidad") + ": "
                + ingredientes.getText());
        System.out.println(precio.getName() + ": " + precio.getText());
    }
}
