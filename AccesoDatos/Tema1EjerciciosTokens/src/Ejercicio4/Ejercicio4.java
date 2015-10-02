package Ejercicio4;

import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;


public class Ejercicio4 {

    public static void main(String args[]) {

        try {
            BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\frase.txt"));
            String linea;
            int count = 0;

            while ((linea = leer.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "#");
                
                while(st.hasMoreTokens()) {
                    st.nextToken();
                    count++;
                }
            }
            System.out.println("Hay " + count + " palabras");
            leer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
