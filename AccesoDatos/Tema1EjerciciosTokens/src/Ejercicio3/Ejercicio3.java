package Ejercicio3;

import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio3 {

    public static void main(String args[]) {

        try {
            BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\strings.txt"));
            String linea;
            int count = 0;

            while ((linea = leer.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "#");
                StringTokenizer st2 = new StringTokenizer(linea, "#");

                String token = st2.nextToken();

                while (st.hasMoreTokens()) {
                    if (token.equals(st.nextToken())) {
                        count++;
                    }
                }
            }
            System.out.println("El valor se repite " + count + " veces");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
