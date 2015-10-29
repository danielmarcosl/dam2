package Ejercicio1;

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
public class Ejercicio1 {

    public static void main(String args[]) {

        // Abrimos el fichero con sax
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\cds.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Cogemos el element root
        Element root = doc.getRootElement();

        // Metemos los hijos CD de root en una lista ya que hay varios
        List cds = root.getChildren("CD");

        // Los iteramos
        Iterator i1 = cds.iterator();

        while (i1.hasNext()) {
            // Recogemos cada element CD
            Element c = (Element) i1.next();

            // Recogemos los element hijos de CD
            Element titulo = c.getChild("Titulo");
            Element artista = c.getChild("Artista");
            Element origen = c.getChild("Origen");
            Element precio = c.getChild("Precio");
            Element ano = c.getChild("Ano");

            // Mostramos el texto que contienen
            System.out.println("Titulo: " + titulo.getText()
                    + ", Artista: " + artista.getText()
                    + ", Origen: " + origen.getText()
                    + ", Precio: " + precio.getText()
                    + ", Ano: " + ano.getText());
        }
    }
}
