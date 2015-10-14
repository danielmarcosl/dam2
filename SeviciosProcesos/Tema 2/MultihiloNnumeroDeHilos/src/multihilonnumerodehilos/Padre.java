package multihilonnumerodehilos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import multihilonnumerodehilos.Operaciones;
import multihilonnumerodehilos.Hijo;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 14/10/2015
 */
public class Padre extends Thread {

    private static int nHilos; // Numero de hilos que se van a crear
    private static int hiloActual = 0; // Numero del hilo que se esta ejecutando actualmente
    private static int N; // Numero que se utilizara para la suma y del que se derivara el numero de hilos

    /**
     * Metodo principal: pide introducir un valor para N, a partir de ese valor
     * calcula el numero de hilos
     *
     * @param args No se usa
     * @throws InterruptedException
     */
    public static void main(String args[]) {

        // Pedimos al usuario que introduzca un numero
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un numero: ");

        try {
            N = Integer.parseInt(teclado.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // Calculamos el numero de hilos que se van a crear
        nHilos = Operaciones.calculaDivisor(N);

        // Mostramos el numero de hilos que se van a crear
        System.out.println("Numero de hilos: " + nHilos);

        // Declaramos las variables que usaremos en el bucle
        Hijo hilo = null; // Llamada al proceso hijo
        int nInicio; // Primer numero a sumar
        int nFinal; // Ultimo numero a sumar

        while (hiloActual < nHilos) {
            nInicio = (((N / nHilos) * (hiloActual + 1)) - (N / nHilos)) + 1; // Calculamos el primer numero
            nFinal = (N / nHilos) * (hiloActual + 1); // Calculamos el ultimo numero

            try {
                hilo = new Hijo(hiloActual, nInicio, nFinal); // Creacion de hilo
                hilo.start(); // Lanzamiento de hilo
                hilo.join(); // Esperamos a que termine para que se ejecuten ordenadamente
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }

            int resultado = hilo.getResultado(); // Recogemos el resultado

            System.out.println(resultado); // Se imprime el resultado

            hiloActual++;
        }
    }
}
