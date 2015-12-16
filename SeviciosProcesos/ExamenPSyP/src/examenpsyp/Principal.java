package examenpsyp;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Principal {

    // Array de 10 enteros
    public static int enteros[] = new int[10];
    // Array de semaforos
    public static Semaphore semaforos[] = new Semaphore[10];
    // Contador de veces sumados
    public static int count = 0;

    /**
     * Metodo main
     *
     * @param args
     */
    public static void main(String args[]) {

        // Inicializar semaforos
        Metodos.inicializarSemaforos();

        // Creamos y lanzamos los 4 hilos
        for (int i = 0; i < 4; i++) {
            Sumador su = new Sumador(i);
            su.start();
        }
    }
}
