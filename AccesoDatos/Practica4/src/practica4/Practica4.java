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

        // Declaramos el element root
        Element root = new Element("tebeos");

        // Creamos los hijos de root y se los anadimos
        Element personajes = new Element("personajes");
        Element autores = new Element("autores");

        root.addContent(personajes);
        root.addContent(autores);

        // Creamos y anadimos los hijos de personajes
        personajes.addContent(new Element("personaje").setAttribute("id", "P001").setAttribute("especie", "humano").setText("Asterix"));
        personajes.addContent(new Element("personaje").setAttribute("id", "P002").setAttribute("especie", "animal").setText("Idefix"));
        personajes.addContent(new Element("personaje").setAttribute("id", "P003").setAttribute("especie", "humano").setText("Lucky Luke"));
        personajes.addContent(new Element("personaje").setAttribute("id", "P004").setAttribute("especie", "animal").setText("Spiderman"));

        // Creamos y anadimos los hijos de autores
        Element dibujantes = new Element("dibujantes");
        Element guionistas = new Element("guionistas");

        autores.addContent(dibujantes);
        autores.addContent(guionistas);

        // Creamos y anadimos los hijos de dibujantes
        Element dibujante1 = new Element("dibujante").setAttribute("id", "D001");
        Element dibujante2 = new Element("dibujante").setAttribute("id", "D002");

        dibujantes.addContent(dibujante1);
        dibujantes.addContent(dibujante2);

        // Creamos y anadimos los hijos de dibujante1 y dibujante2
        dibujante1.addContent(new Element("nombre").setText("Albert Uderzo"));
        dibujante1.addContent(new Element("nacimientoFecha").setText("1927"));
        dibujante1.addContent(new Element("nacimientoPais").setText("Francia"));

        dibujante2.addContent(new Element("nombre").setText("Maurice de Bevere"));
        dibujante2.addContent(new Element("nacimientoFecha").setText("1923"));
        dibujante2.addContent(new Element("nacimientoPais").setText("Belgica"));
        dibujante2.addContent(new Element("fallecimientoFecha").setText("2001"));

        // Creamos y anadimos el hijo de guionistas
        Element guionista1 = new Element("guionista").setAttribute("id", "G001");

        guionistas.addContent(guionista1);

        // Creamos y anadimos los hijos de guionista1
        guionista1.addContent(new Element("nombre").setText("Rene Goscinny"));
        guionista1.addContent(new Element("nacimientoFecha").setText("1926"));
        guionista1.addContent(new Element("nacimientoPais").setText("Francia"));
        guionista1.addContent(new Element("fallecimientoFecha").setText("1977"));

        // Creamos el documento y lo mostramos
        Document doc = new Document(root);
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Practica4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Cogemos los hijos de guionistas
        List<Element> listaGuionistas = guionistas.getChildren();
        // Los iteramos
        Iterator i = listaGuionistas.iterator();

        // Borramos la fecha de fallecimiento del guionista con id G001
        while (i.hasNext()) {
            Element g = (Element) i.next();

            if (g.getAttributeValue("id").equals("G001")) {
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
        autores.setAttribute("famosos", "si");

        // Mostramos el resultado
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            Logger.getLogger(Practica4.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Cogemos los hijos de dibujantes
        List<Element> listaDibujantes = dibujantes.getChildren("dibujante");
        // Los iteramos
        Iterator i2 = listaDibujantes.iterator();

        //Modificamos la fecha de nacimiento del dibujante nacido en Belgica 
        while (i2.hasNext()) {
            Element d = (Element) i2.next();

            if (d.getChild("nacimientoPais").getText().equals("Belgica")) {
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
