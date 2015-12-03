package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import Herramientas.Herramientas;

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
        String ruta = "C:\\petra\\alumnos.obj";
        // Variable para almacenar la media
        double media = 0;

        // Map de alumnos con su dni
        HashMap<String, Alumno> mapAlumno = null;

        try {
            // Creamos los alumnos, los anadimos al HashMap y los escribimos en el fichero
            Herramientas.escribirMapYFichero(teclado, ruta, mapAlumno, numeroAlumnos);

            //Mostramos la lista
            Herramientas.mostrarLista();
            // Pedimos al usuario que escoja una opcion
            opcion = Herramientas.pedirOpcion(teclado);

            // Switch para filtrar el resultado
            while (!opcion.equals("F")) {
                switch (opcion) {
                    case "A":
                        Herramientas.mostrarDatos(ruta);
                        break;
                    case "B":
                        media = Herramientas.calcularMedia(ruta);
                        break;
                    case "C":
                        Herramientas.mostrarAlumnosMedia(ruta, media);
                        break;
                    default:
                        System.out.println("\nOpcion no valida, vuelva a intentarlo\n");
                        break;
                } // fin switch

                //Mostramos la lista
                Herramientas.mostrarLista();
                // Pedimos al usuario que escoja una opcion
                opcion = Herramientas.pedirOpcion(teclado);
            } // fin while
        } catch (IOException ex) {
            ex.printStackTrace();
        } // fin try/catch
    } // fin main
} // fin class
