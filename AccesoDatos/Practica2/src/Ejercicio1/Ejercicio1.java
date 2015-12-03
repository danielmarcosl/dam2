package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import Herramientas.HerramientasEjercicio1;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Metodo para leer por teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        // Numero de alumnos
        int numeroAlumnos = 2;
        // Variable para almacenar la opcion del menu introducida por el usuario
        String opcion = null;
        // Direccion donde se creara y se leera el fichero
        String ruta = "C:\\petra\\FichInfoAlumno.txt";
        // Variable para almacenar la media
        double media = 0;

        // Map de alumnos con su dni
        HashMap<String, Alumno> mapAlumno = null;

        try {
            // Creamos los alumnos, los anadimos al HashMap y los escribimos en el fichero
            HerramientasEjercicio1.escribirMapYFichero(teclado, ruta, mapAlumno, numeroAlumnos);

            // Mostramos la lista
            HerramientasEjercicio1.mostrarLista();
            // Pedimos al usuario que escoja una opcion
            opcion = HerramientasEjercicio1.pedirOpcion(teclado);

            // Switch para filtrar el resultado
            while (!opcion.equals("F")) {
                switch (opcion) {
                    case "A":
                        HerramientasEjercicio1.mostrarDatos(ruta);
                        break;
                    case "B":
                        media = HerramientasEjercicio1.calcularMedia(ruta);
                        break;
                    case "C":
                        HerramientasEjercicio1.mostrarAlumnosMedia(ruta, media);
                        break;
                    default:
                        System.out.println("\nOpcion no valida, vuelva a intentarlo\n");
                        break;
                } // fin switch

                // Mostramos la lista
                HerramientasEjercicio1.mostrarLista();
                // Pedimos al usuario que escoja una opcion
                opcion = HerramientasEjercicio1.pedirOpcion(teclado);
            } // fin while
        } catch (IOException ex) {
            ex.printStackTrace();
        } // fin try/catch
    } // fin main
} // fin class
