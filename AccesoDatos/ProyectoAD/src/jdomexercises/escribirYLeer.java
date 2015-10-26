package jdomexercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class escribirYLeer {

    public static void crearArbol(Element root,
            ArrayList<Element> hijo,
            ArrayList<ArrayList<Element>> hijoDeHijo) {

        Element child;
        Element childchild;

        for (int j = 0; j < hijo.size(); j++) {
            child = hijo.get(j);
            for (int i = 0; i < hijoDeHijo.get(j).size(); i++) {
                childchild = hijoDeHijo.get(j).get(i);
                child.addContent(childchild);
            }
            root.addContent(child);
        }
    }
    
    public static void escribirFichero(Document documento, String nombre) throws IOException {
        XMLOutputter salida = new XMLOutputter();

        salida.output(documento, System.out);
        salida.output(documento, new FileOutputStream("C:\\Users\\Alumnot\\Documents\\" + nombre + ".xml"));
    }

    public static void main(String args[]) {

        ArrayList<Element> menu1 = new ArrayList<Element>();
        menu1.add(new Element("Primer").setText("Sopa"));
        menu1.add(new Element("Segundo").setText("Segundo"));
        menu1.add(new Element("Tercero").setText("Flan"));
        
        ArrayList<Element> menu2 = new ArrayList<Element>();
        menu2.add(new Element("Primero").setText("Spaguetti"));
        menu2.add(new Element("Segundo").setText("Ensalada"));
        menu2.add(new Element("Tercer").setText("Tarta"));
        
        ArrayList<ArrayList<Element>> platos = new ArrayList<ArrayList<Element>>();
        platos.add(menu1);
        platos.add(menu2);
        
        ArrayList<Element> menus = new ArrayList<Element>();
        menus.add(new Element("Menu").setAttribute("ID","100"));
        menus.add(new Element("Menu").setAttribute("ID","200"));
        
        Element root = new Element("Menus");
        
        crearArbol(root, menus, platos);
        
        Document doc = new Document(root);
        
        try {
            escribirFichero(doc, "menus");
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        
        try {
            SAXBuilder builder = new SAXBuilder();
            Document d = builder.build(new FileInputStream("C:\\Users\\Alumnot\\Documents\\ej1.xml"));

            // Leer la raiz
            Element er = doc.getRootElement(); // Devuelve la raíz
            System.out.println(er.getName());

            // Creamos una lista que contendra los hijos de root
            List<Element> t = root.getChildren("Menu");

            // Si hubiera otro hijo habría que ahcer otro getChildren()
            Iterator it = t.iterator();

            while (it.hasNext()) {
                Element e = (Element) it.next();
                System.out.println(e.getName() +
                        ", ID: " + e.getAttributeValue("ID"));
                
                Element c = e.getChild("Primero");
                System.out.println(c.getName() + ", " + c.getText());

                c = e.getChild("Segundo");
                System.out.println(c.getName() + ", " + c.getText());

                c = e.getChild("Tercero");
                System.out.println(c.getName() + ", " + c.getText());
            }
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
