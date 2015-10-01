package Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ejercicio1 {

    public static void main(String args[]) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String linea;

        try {
            BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\\\Users\\\\Alumnot\\\\Documents\\\\dam2\\\\AccesoDatos\\\\Tema1EjerciciosTokens\\\\src\\\\Ejercicio1\\\\fichero.txt"));

            System.out.println("Introduce 3 palabras separadas por #");
            fw.write(teclado.readLine());

            fw.close();

            BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\dam2\\AccesoDatos\\Tema1EjerciciosTokens\\src\\Ejercicio1\\fichero.txt"));

            String elemento1 = "";
            String elemento2 = "";
            String elemento3 = "";

            while ((linea = fr.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "#");

                while (st.hasMoreTokens()) {
                    elemento1 = st.nextToken();
                    elemento2 = st.nextToken();
                    elemento3 = st.nextToken();
                }
            }
            fr.close();
            
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
