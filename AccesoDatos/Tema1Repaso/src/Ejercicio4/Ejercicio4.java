package Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Ejercicio4.Metodos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio4 {

    public static void main(String args[]) {

        // Mostramos el menu
        Metodos.escribirMenu();

        // Declaramos la variable donde se almacenara la opcion introducida por el usuario
        int opcion = 0;

        // Declaramos la variable donde se guardara el nombre del fichero
        String fichero = "";

        // Preguntamos la opcion
        try {
            opcion = Metodos.preguntarOpcion();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    // Crear ArrayList con los 100 primeros pares
                    ArrayList<String> arrayPares = Metodos.arrayPar();

                    // Preguntar al usuarioe el nombre del archivo donde se guardara
                    try {
                        fichero = Metodos.preguntarFichero();
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                    // Escribir ArrayList en el fichero
                    try {
                        Metodos.escribirArrayPares(arrayPares, fichero);
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }

                    // Volvemos a mostar el menu
                    Metodos.escribirMenu();
                    // Volvemos a preguntar la opcion
                    try {
                        opcion = Metodos.preguntarOpcion();
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                    break;
                case 2:
                    try {
                        // Mostramos el contenido de la tercera linea del fichero
                        Metodos.mostrarTerceraPosicion(fichero);
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }

                    // Volvemos a mostar el menu
                    Metodos.escribirMenu();
                    // Volvemos a preguntar la opcion
                    try {
                        opcion = Metodos.preguntarOpcion();
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                    break;
            }
        }
    }
}
