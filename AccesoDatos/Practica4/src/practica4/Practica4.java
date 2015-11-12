package practica4;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;

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
        dibujante2.addContent(new Element("apodo").setText("Morris"));
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

        // Creamos el documento y lo mostramos por volcado rapido
        Document doc = new Document(root);
        try {
            Herramientas.escribirXML(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Mostramos el documento elemento por elemento
        System.out.println(root.getName());
        System.out.println(personajes.getName());

        List<Element> listaPersonajes = personajes.getChildren("personaje");

        Iterator iPersonajes = listaPersonajes.iterator();
        while (iPersonajes.hasNext()) {
            Element p = (Element) iPersonajes.next();
            System.out.println(p.getName()
                    + " id: " + p.getAttributeValue("id")
                    + " especie: " + p.getAttributeValue("especie")
                    + ", " + p.getText());
        }

        System.out.println(autores.getName());
        System.out.println(dibujantes.getName());

        System.out.println(dibujante1.getName()
                + " id: " + dibujante1.getAttributeValue("id"));

        // Cogemos los hijos de dibujante1
        List<Element> listaDibujante1 = dibujante1.getChildren();

        Iterator iDibujante1 = listaDibujante1.iterator();

        while (iDibujante1.hasNext()) {
            Element n = (Element) iDibujante1.next();
            Element nf = (Element) iDibujante1.next();
            Element np = (Element) iDibujante1.next();

            System.out.println(n.getName() + " " + n.getText());
            System.out.println(nf.getName() + " " + nf.getText());
            System.out.println(np.getName() + " " + np.getText());
        }

        System.out.println(dibujante2.getName()
                + " id: " + dibujante2.getAttributeValue("id"));

        // Cogemos los hijos de dibujante2
        List<Element> listaDibujante2 = dibujante2.getChildren();

        Iterator iDibujante2 = listaDibujante2.iterator();

        while (iDibujante2.hasNext()) {
            Element n = (Element) iDibujante2.next();
            Element a = (Element) iDibujante2.next();
            Element nf = (Element) iDibujante2.next();
            Element np = (Element) iDibujante2.next();
            Element ff = (Element) iDibujante2.next();

            System.out.println(n.getName() + " " + n.getText());
            System.out.println(a.getName() + " " + a.getText());
            System.out.println(nf.getName() + " " + nf.getText());
            System.out.println(np.getName() + " " + np.getText());
            System.out.println(ff.getName() + " " + ff.getText());
        }

        System.out.println(guionistas.getName());

        System.out.println(guionista1.getName()
                + " id: " + guionista1.getAttributeValue("id"));

        // Cogemos los hijos de guionista1
        List<Element> listaGuionista1 = guionista1.getChildren();

        Iterator iGuionista1 = listaGuionista1.iterator();

        while (iDibujante2.hasNext()) {
            Element n = (Element) iGuionista1.next();
            Element a = (Element) iGuionista1.next();
            Element nf = (Element) iGuionista1.next();
            Element np = (Element) iGuionista1.next();
            Element ff = (Element) iGuionista1.next();

            System.out.println(n.getName() + " " + n.getText());
            System.out.println(nf.getName() + " " + nf.getText());
            System.out.println(np.getName() + " " + np.getText());
            System.out.println(ff.getName() + " " + ff.getText());
        }

        //
        // Ejercicio1
        //
        // Borramos la fecha de fallecimiento del guionista con id G001
        System.out.println("\nEjercicio1\n");

        // Cogemos los hijos de guionistas
        List<Element> listaGuionistas = guionistas.getChildren();
        // Los iteramos
        Iterator i = listaGuionistas.iterator();

        while (i.hasNext()) {
            Element g = (Element) i.next();

            if (g.getAttributeValue("id").equals("G001")) {
                g.removeChild("fallecimientoFecha");

                // Mostramos el resultado
                List<Element> listaHijosGuionista1 = g.getChildren();
                Iterator ite = listaHijosGuionista1.iterator();

                while (ite.hasNext()) {
                    Element h = (Element) ite.next();
                    System.out.println(h.getName() + " " + h.getText());
                }
                System.out.println(g.getName());
            }
        }

        //
        // Ejercicio2
        //
        // Anadimos a autores el atributo famosos con el valor si
        System.out.println("\nEjercicio2\n");

        autores.setAttribute("famosos", "si");

        // Mostramos el resultado
        System.out.println(autores.getName() + " famosos = " + autores.getAttributeValue("famosos"));

        //
        // Ejercicio3
        //
        // Modificamos la fecha de nacimiento del dibujante nacido en Belgica
        System.out.println("\nEjercicio3\n");

        // Creamos una lista con los hijos de dibujantes
        List<Element> listaDibujantes = dibujantes.getChildren("dibujante");
        // La iteramos
        Iterator i2 = listaDibujantes.iterator();

        while (i2.hasNext()) {
            Element d = (Element) i2.next();

            if (d.getChild("nacimientoPais").getText().equals("Belgica")) {
                d.getChild("nacimientoFecha").setText("1995");

                // Mostramos el resultado
                System.out.println(d.getChild("nacimientoFecha").getName() + " "
                        + d.getChild("nacimientoFecha").getText());
            }
        }
    }
}
