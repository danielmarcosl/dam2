package ProyectoAD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import Herramientas.herramientas;
import java.io.IOException;
import java.io.FileReader;

public class leerFicheroAsignatura {

    public static void main(String args[]) {
        
        try {
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\asignaturas.txt"));
            
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            
            //while (fl.ready()) {
            for(int i = 0; i < 4; i++) {
                System.out.println("Introduce una asignatura");
                System.out.println(fl.readLine());
                System.out.println("Introduce una nota");
                System.out.println(fl.readLine());
            }
        } catch (IOException ex) {
            System.out.println("Que bien eh");
        }
        // Escribir el fichero
        // Hacer un menú
        // Leer todo el fichero
        // Leer la asignatura 2
    }
}
