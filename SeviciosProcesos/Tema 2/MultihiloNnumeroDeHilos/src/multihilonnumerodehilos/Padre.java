package multihilonnumerodehilos;

import multihilonnumerodehilos.Operaciones;
import multihilonnumerodehilos.Hijo;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 09/10/2015
 */
public class Padre extends Thread {

    private static int nHilos = 4; // Numero de hilos que se van a crear
    private static int hiloActual = 0; // Numero del hilo que se esta ejecutando actualmente
    private static int N; // Numero que se utilizara para la suma y del que se derivara el numero de hilos

    /**
     * Metodo principal, crea hilos, los lanza y recoge el resultado
     *
     * @param args No se usa
     * @throws InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
        Hijo hilo = null;

        while (hiloActual < nHilos) {
            hilo = new Hijo(hiloActual);
            hilo.start();
            hilo.join();
            int resultado = hilo.getResultado();

            System.out.println(resultado);

            hiloActual++;
        }
    
}
