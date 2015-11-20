package hojaabreviados;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.Herramientas;
/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio3 {

    public static void main(String args[]) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\ciclos3.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        //Nombre de los módulos que se imparten en el Instituto
        System.out.println("\nApartado 0\n");
        Herramientas.xpath(doc, "//child::modulo/child::nombre");
        
        //1. Nombre de los módulos del ciclo ASIR
        System.out.println("\nApartado 1\n");
        Herramientas.xpath(doc, "//child::modulo[child::ciclo='ASIR']/child::nombre");
        
        //2. Nombre de los módulos que se imparten en el segundo curso de cualquier ciclo
        System.out.println("\nApartado 2\n");
        Herramientas.xpath(doc, "//child::modulo[child::curso=2]/child::nombre");
        
        //3. Nombre de los módulos de menos de 5 horas semanales: 
        System.out.println("\nApartado 3\n");
        Herramientas.xpath(doc, "//child::modulo[child::horasSemanales<5]/child::nombre");
        
        //4. Nombre de los módulos que se imparten en el primer curso de ASIR: 
        System.out.println("\nApartado 4\n");
        Herramientas.xpath(doc, "//child::modulo[child::ciclo='ASIR' and child::curso=1]/child::nombre");
        
        //5. Horas semanales de los módulos de más de 3 horas semanales (4, 5, 5). 
        System.out.println("\nApartado 5\n");
        Herramientas.xpath(doc, "//child::horasSemanales[self::horasSemanales>3]");
    }
}
