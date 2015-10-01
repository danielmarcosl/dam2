package ProyectoAD;

import java.io.*;
import java.util.*;

public class Tokens {

    public static void main(String args[]) {

        try {
                        BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\dam2\\AccesoDatos\\ProyectoAD\\src\\ProyectoAD\\clientes.txt"));
            String linea = null;
            
            while ((linea = fl.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea,"#");
                
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
