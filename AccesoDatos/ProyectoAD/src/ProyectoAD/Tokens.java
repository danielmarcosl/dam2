package ProyectoAD;

import java.io.*;
import java.util.*;

public class Tokens {

    public static void main(String args[]) {

        try {
            /**
             * Abrimos el fichero de forma secuencial
             */
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\dam2\\AccesoDatos\\ProyectoAD\\src\\ProyectoAD\\clientes.txt"));
            String linea = null;

            /**
             * Mientras haya lineas, las coge y las almacena en el String linea
             */
            while ((linea = fl.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea,"#");
                /**
                 * Mientras haya tokens, almacena los valores guardados en el archivo
                 * @codigo = primer valor
                 * @nom = segundo valor
                 * @suel = tercer valor
                 */
                while (st.hasMoreTokens()) {
                    String codigo = st.nextToken();
                    String nom = st.nextToken();
                    String suel = st.nextToken();
                    // Imprimimos por pantalla las lineas sin los tokens
                    System.out.println(codigo + nom + suel);
                }
            }
            // Cerramos el fichero
            fl.close();
        } catch (IOException e) {
        	// Si ha habido un error, mostrarlo
            System.out.println("Error: " + e);
        }
    }
}
