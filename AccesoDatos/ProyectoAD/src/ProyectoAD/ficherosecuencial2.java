package ProyectoAD;

import java.io.*;
import java.util.*;

public class ficherosecuencial2 {

    public static void main(String args[]) {
        // Leer por teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        // Escribir en el fichero secuencial
        try {
            BufferedWriter fe = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Documents\\ejemplo.txt"));

            for (int i = 1; i <= 3; i++) {
                //fe.write(scan.nextLine());
                fe.write(teclado.readLine());
                fe.newLine();
            }
            fe.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
