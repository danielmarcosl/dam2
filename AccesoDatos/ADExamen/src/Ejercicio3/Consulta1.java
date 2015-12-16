/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Consulta1 {
    public static void main (String args[]) {
        // Abrimos el fichero
        Document doc = null;
        try {
            doc = new SAXBuilder().build(".\\src\\Ejercicio3\\arbol.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        //Metodos.xpath(doc, "//child::actor[@nacionalidad='uk']../../child::director");
        Metodos.xpath(doc, "//child::cine[self::id[count>2]]../../child::titulo");
    }
}
