package hojaabreviados;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio4 {

    public static void main(String args[]) {
        
        Document doc = null;
        
        try {
            doc = new SAXBuilder().build("asdf");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
