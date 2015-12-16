package Ejercicio2;

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
public class LeerEXML {

    public static void main(String args[]) {
        // Abrimos el documento
        Document doc = null;
        try {
            doc = new SAXBuilder().build(".\\src\\Ejercicio2\\ficheroEXML.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Cogemos el elemento root
        Element root = doc.getRootElement();
        // Lo mostramos
        System.out.println(root.getName());
        // Cogemos los hijos de root
        List<Element> alumno = root.getChildren("alumno");

        // Los iteramos
        Iterator ialumno = alumno.iterator();
        // Recorremos la lista de alumnos
        while (ialumno.hasNext()) {
            // Cogemos el element
            Element a = (Element) ialumno.next();
            // Lo mostramos
            System.out.print(" " + a.getName() + ", id " + a.getAttributeValue("id"));
            // Filtramos el atributo que solo tiene uno de ellos
            if (a.getAttributeValue("becado") != null) {
                System.out.print(", becado: " + a.getAttributeValue("becado") + "\n");
            } else {
                System.out.println("");
            }
            // Cogemos sus hijos
            Element apellido1 = a.getChild("apellido1");
            Element apellido2 = a.getChild("apellido2");
            Element nombre = a.getChild("nombre");
            Element sexo = a.getChild("sexo");
            Element modulos = a.getChild("Modulos");

            // Los mostramos
            System.out.println("  " + apellido1.getName() + apellido1.getText()
                    + "\n  " + apellido2.getName() + apellido2.getText()
                    + "\n  " + nombre.getName() + nombre.getText()
                    + "\n  " + modulos.getName());

            // Cogemos el hijo de modulos
            Element asignaturas = modulos.getChild("asignaturas");
            // Cogemos los hijos de asignaturas
            List<Element> listAsignaturas = asignaturas.getChildren("asignatura");

            // Las iteramos
            Iterator ilistasignaturas = listAsignaturas.iterator();
            // Recorremos la lista
            while (ilistasignaturas.hasNext()) {
                // Cogemos el primer hijo
                Element asig = (Element) ilistasignaturas.next();
                // Lo mostramos
                System.out.println("   " + asig.getName() + ": " + asig.getText()
                        + ", codigo " + asig.getAttributeValue("codigo"));
            }
            Element inicio = asignaturas.getChild("inicio");
            System.out.println("   " + inicio.getName() + ": " + inicio.getText());
        }
    }
}
