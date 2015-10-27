package Ejercicio4;

import java.util.ArrayList;
import org.jdom2.Element;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio4 {
    
    public static void main(String args[]) {
        
        //Creamos un ArrayList para la primera persona
        ArrayList<Element> persona1 = new ArrayList<Element>();
        persona1.add(new Element("Nombre").setText("Juan"));
        persona1.add(new Element("Apellidos").setText("Pardo"));
        persona1.add(new Element("Nacimiento").setAttribute("Dia","10").setAttribute("Mes","Abril").setAttribute("Ano","1982"));
        persona1.add(new Element("Direccion"));
        persona1.add(new Element("Varon"));
        
        // Creamos un ArrayList para su direccion
        ArrayList<Element> persona1Direccion = new ArrayList<Element>();
        persona1Direccion.add(new Element("Calle").setText("Caoba, 1"));
        persona1Direccion.add(new Element("Poblacion").setText("Madrid"));
        persona1Direccion.add(new Element("Provincia").setText("Madrid"));
        persona1Direccion.add(new Element("Codigo Postal").setText("28005"));
    }
}
