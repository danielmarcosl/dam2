package Ejercicio5;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.Herramientas;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio05 {

    public static void main(String args[]) {

        // Abrimos el documento
        Document doc = null;
        try {
            doc = new SAXBuilder().build("D:\\Libraries\\Documents\\liga.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Cogemos el elemento root
        Element root = doc.getRootElement();

        // Anadimos una nueva plantilla
        Element nuevoEquipo = new Element("equipo");
        Element nuevaPlantilla = new Element("plantilla");
        nuevaPlantilla.addContent(new Element("nombre").setText("Cahlos"));
        nuevaPlantilla.addContent(new Element("nombre").setText("Chaves Parrales"));
        nuevoEquipo.addContent(nuevaPlantilla);
        root.addContent(nuevoEquipo);

        // Mostramos el resultado
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Cogemos el elemento arbitros
        Element arbitros = root.getChild("arbitros");
        // Cogemos los hijos de arbitros
        List<Element> listaArbitros = arbitros.getChildren("nombre");

        // Los iteramos
        Iterator i = listaArbitros.iterator();

        // Les cambiamos el nombre
        Element a1 = (Element) i.next();
        Element a2 = (Element) i.next();
        a1.setName("colegiado_uno");
        a2.setName("colegiado_dos");

        // Mostramos el resultado
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Cogemos los hijos de root llamados equipo
        List<Element> listaEquipo = root.getChildren("equipo");

        // Los iteramos
        Iterator i2 = listaEquipo.iterator();

        // Cambiamos el nombre del presidente del club con texto Real Madrid
        while (i2.hasNext()) {
            Element e = (Element) i2.next();
            Element club = e.getChild("club");

            if (club.getText().equals("Real Madrid")) {
                e.getChild("presidente").setText("Florentino");
            }
        }

        // Mostramos el resultado
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Volvemos a iterar los equipos
        Iterator i3 = listaEquipo.iterator();

        // Mostramos los que no tienen extranjeros
        while (i3.hasNext()) {
            Element e = (Element) i3.next();
            
            if (e.getChild("conextranjeros") != null) {
                System.out.println(e.getChild("club").getText());
            }
        }
        
        // Volvemos a iterar los equipos
        Iterator i4 = listaEquipo.iterator();
        
        // Cambiamos la valoracion de club a 10 si es menor de 6
        while (i4.hasNext()) {
            Element e = (Element) i4.next();
            
            if(Integer.parseInt(e.getChild("club").getAttributeValue("valoracion")) < 6) {
                e.getChild("club").setAttribute("valoracion","6");
            }
        }
    }
}
