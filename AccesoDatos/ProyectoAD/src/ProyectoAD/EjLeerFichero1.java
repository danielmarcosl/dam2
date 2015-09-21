package ProyectoAD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjLeerFichero1 {

    public static void main(String args[]) {

        try {
            // Método para leer por teclado
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            // Seleccionamos el fichero donde se va a escribir
            BufferedWriter fe = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Documents\\ejemplo.txt"));

            System.out.println("Introduce 4 productos con el formato codigo, producto, precio");

            // Creamos un bucle para escribir 4 líneas
            for (int i = 0; i < 4; i++) {
                fe.write(teclado.readLine());
                fe.newLine();
            }
            fe.close();
        } catch (IOException e) {
            System.out.println("error");
        }

        try {
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\ejemplo.txt"));

            Integer count = 0;

            while (fl.ready() && count != 2) {
                System.out.println(fl.readLine());

                count++;
            }
            fl.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
