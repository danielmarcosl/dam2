package Ejercicio3;

import java.io.IOException;
import java.util.ArrayList;
import org.jdom2.Document;
import org.jdom2.Element;

import Herramientas.Herramientas;

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

        // Creamos un ArrayList que contendra los anteriores ArrayList
        ArrayList<ArrayList<Element>> vehiculos = new ArrayList<ArrayList<Element>>();
        vehiculos.add(Terrestres);
        vehiculos.add(Acuaticos);
        vehiculos.add(Aereos);

        // Creamos la etiqueta root vehiculos <Vehiculos></Vehiculos>
        Element root = new Element("Vehiculos");

        // Creamos un ArrayList para los tipos de vehiculo
        ArrayList<Element> tipoVehiculos = new ArrayList<Element>();

        tipoVehiculos.add(new Element("Terrestres"));
        tipoVehiculos.add(new Element("Acuaticos"));
        tipoVehiculos.add(new Element("Aereos"));

        // Creamos el arbol
        Herramientas.crearArbolNivel3(root, tipoVehiculos, vehiculos);

        // Creamos un documento que contenga el arbol
        Document doc = new Document(root);

        // Escribimos el fichero
        try {
            Herramientas.escribirFichero(doc, "vehiculos");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
