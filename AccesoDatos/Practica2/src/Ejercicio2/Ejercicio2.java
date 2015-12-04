package Ejercicio2;

import Herramientas.HerramientasEjercicio1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import Herramientas.HerramientasEjercicio2;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio2 {

    public static void main(String args[]) {
        // Metodo para leer por teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        // Numero de libros
        int numeroLibros = 5;
        // Numero para asignar el maximo de largo para convertir a UTF
        int maximo = 20;
        // Variable donde se almacenara la opcion elegida por el usuario
        String opcion = null;
        // Direccion donde se creara y se leera el fichero
        String ruta = "C:\\petra\\Fichinfolibros.txt";

        try {
            // Creamos los libros y los escribimos en el fichero
            HerramientasEjercicio2.crearLibros(teclado, ruta, numeroLibros, maximo);

            // Mostramos la lista
            HerramientasEjercicio2.mostrarLista();
            // Pedimos al usuario que escoja una opcion
            opcion = HerramientasEjercicio1.pedirOpcion(teclado);

            // Switch para filtrar el resultado
            while (!opcion.equals("F")) {
                switch (opcion) {
                    case "A":
                        HerramientasEjercicio2.mostrarUltimoLibro(ruta);
                        break;
                    case "B":
                        break;
                    case "C":
                        break;
                    default:
                        System.out.println("\nOpcion no valida, vuelva a intentarlo\n");
                        break;
                }

                // Mostramos la lista
                HerramientasEjercicio2.mostrarLista();
                // Pedimos al usuario que escoja una opcion
                opcion = HerramientasEjercicio1.pedirOpcion(teclado);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } // fin try/catch
    } // fin main
} // fin class
