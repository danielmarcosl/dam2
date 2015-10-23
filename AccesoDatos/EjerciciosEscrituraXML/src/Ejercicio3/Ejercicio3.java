package Ejercicio3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio3 {

    public static void main(String args[]) {

        // Creamos un ArrayList para los vehiculos Terrestres
        ArrayList<Element> Terrestres = new ArrayList<Element>();
        Terrestres.add(new Element("Vehiculo").setText("Bicicleta"));
        Terrestres.add(new Element("Vehiculo").setText("Coche"));
        Terrestres.add(new Element("Vehiculo").setText("Tractor"));

        // Creamos un ArrayList para los vehiculos acuaticos
        ArrayList<Element> Acuaticos = new ArrayList<Element>();
        Acuaticos.add(new Element("Vehiculo").setText("Canoa"));

        // Creamos un ArrayList para los vehiculos aereos
        ArrayList<Element> Aereos = new ArrayList<Element>();
        Aereos.add(new Element("Vehiculo").setText("Avioneta"));
        Aereos.add(new Element("Vehiculo").setText("Helicoptero"));

        // Creamos la etiqueta root vehiculos <Vehiculos></Vehiculos>
        Element vehiculos = new Element("Vehiculos");

        // Creamos un ArrayList para los tipos de vehiculo
        ArrayList<Element> rootchild = new ArrayList<Element>();

        rootchild.add(new Element("Terrestres"));
        rootchild.add(new Element("Acuaticos"));
        rootchild.add(new Element("Aereos"));

        // Creamos un ArrayList que contendra los anteriores ArrayList
        ArrayList<ArrayList<Element>> rootchildchild = new ArrayList<ArrayList<Element>>();
        rootchildchild.add(Terrestres);
        rootchildchild.add(Acuaticos);
        rootchildchild.add(Aereos);

        // Creamos el arbol
        Metodos.crearArbol(vehiculos, rootchild, rootchildchild);

        // Creamos un documento que contenga el arbol
        Document doc = new Document(vehiculos);

        // Escribimos el fichero
        try {
            Ejercicio2.Metodos.escribirFichero(doc);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
