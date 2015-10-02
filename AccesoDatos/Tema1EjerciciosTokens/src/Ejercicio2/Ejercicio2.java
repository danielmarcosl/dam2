package Ejercicio2;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio2 {

    public static void main(String args[]) {

        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Documents\\numeros.txt"));

            System.out.println("Escribe una cadena de texto");
            
            StringTokenizer st = new StringTokenizer(teclado.readLine()," ");

            while (st.hasMoreTokens()) {
                escribir.write(st.nextToken() + "@");
            }
            escribir.close();

            BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\numeros.txt"));
            String linea;

            while ((linea = leer.readLine()) != null) {
                System.out.println(linea);
            }
            leer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
