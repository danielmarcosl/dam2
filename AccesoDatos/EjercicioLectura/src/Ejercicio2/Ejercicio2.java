package Ejercicio2;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio2 {

    public static void main(String args[]) {
        
        // Abrimos el fichero con sax
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\vehiculos.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Cogemos el elemento root
        Element root = doc.getRootElement();
        
        // Creamos una list para cada hijo
        List terrestres = root.getChildren("Terrestres");
        List acuaticos = root.getChildren("Acuaticos");
        List aereos = root.getChildren("Aereos");
        
        // Los iteramos
        Iterator i1 = terrestres.iterator();
        Iterator i2 = acuaticos.iterator();
        Iterator i3 = aereos.iterator();
        
        while (i1.hasNext()) {
            // Cogemos el element Terrestres
            Element t = (Element) i1.next();
            
            Element v1 = t.getChild("Vehiculo");
            Element v2 = t.getChild("Vehiculo");
            Element v3 = t.getChild("Vehiculo");
        }
    }
}
