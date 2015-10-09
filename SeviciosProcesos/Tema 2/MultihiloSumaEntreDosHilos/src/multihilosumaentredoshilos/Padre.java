package multihilosumaentredoshilos;

import multihilosumaentredoshilos.Operaciones;
import multihilosumaentredoshilos.Hijo;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 09/10/2015
 */
public class Padre extends Thread {

    private static int nHilos = 2; // Numero de hilos que se van a crear
    private static int hiloActual = 0; // Numero del hilo que se esta ejecutando actualmente
    private static int N = 20; // Numero para calcular la suma
   
    /**
     * Metodo principal, crea hilos, los lanza y recoge el resultado
     *
     * @param args No se usa
     * @throws InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
        Hijo hilo = null;

        while (hiloActual < nHilos) {
            hilo = new Hijo(hiloActual, N);
            hilo.start();
            hilo.join();
            int resultado = hilo.getResultado();

            System.out.println(resultado);

            hiloActual++;
        }
    }
}
