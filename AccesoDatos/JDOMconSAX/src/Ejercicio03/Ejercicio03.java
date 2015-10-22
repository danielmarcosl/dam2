package Ejercicio03;

import org.jdom2.Element;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio03 {

    public static void main(String args[]) {
        Element equipo = new Element("Equipo");
        
        Element club = new Element("Club").setAttribute("Valoracion", "10").setAttribute("Ciudad", "Bilbao").setText("Athletic Club Bilbao");
        
        Element presidente = new Element("Presidente").setText("Uria");
        
        Element plantilla = new Element("Plantilla");
        
        Element jugador1 = new Element("Nombre").setText("Marco Revelo");
        Element jugador2 = new Element("Nombre").setText("David Aldas");
        Element jugador3 = new Element("Nombre").setText("Mi programa");
    }

}
