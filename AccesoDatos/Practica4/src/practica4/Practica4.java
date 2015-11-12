package practica4;

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
public class Practica4 {
    
    public static void main(String[] args) {
        
        // Abrimos el documento
        Document doc = null;
        try {
            doc = new SAXBuilder().build("C:\\petra\\tebeos.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // Cogemos el element root
        Element root = doc.getRootElement();
        // Cogemos el element autores
        Element autores = root.getChild("autores");
        // Cogemos el element guionistas
        Element guionistas = autores.getChild("guionistas");
        
        // Cogemos los hijos de guionistas
        List<Element> listaGuionistas = guionistas.getChildren();
        // Los iteramos
        Iterator i = listaGuionistas.iterator();
        
        // Borramos la fecha de fallecimiento del guionista con id G001
        while(i.hasNext()) {
            Element g = (Element) i.next();
            
            if(g.getAttributeValue("id").equals("G001")) {
                g.removeChild("fallecimientoFecha");
            }
        }
        
        // Mostramos el resultado
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Practica4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Anadimos a autores el atributo famosos con el valor si
        autores.setAttribute("famosos","si");
        
        // Mostramos el resultado
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Practica4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Cogemos el elemento dibujantes
        Element dibujantes = autores.getChild("dibujantes");
        
        // Cogemos los hijos de dibujantes
        List<Element> listaDibujantes = dibujantes.getChildren("dibujante");
        // Los iteramos
        Iterator i2 = listaDibujantes.iterator();
        
        //Modificamos la fecha de nacimiento del dibujante nacido en Belgica 
        while (i2.hasNext()) {
            Element d = (Element) i2.next();
            
            if(d.getChild("nacimientoPais").getText().equals("Belgica")) {
                d.getChild("nacimientoFecha").setText("1995");
            }
        }
        
        try {
            // Mostramos el resultado
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Practica4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
