package examenpsyp;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Metodos {

    /**
     * Metodo para generar un numero aleatorio entre 0 y 99
     *
     * @return Numero aleatorio entre 0 y 99
     */
    public static int generarAleatorio() {
        Random rand = new Random();
        int num = rand.nextInt(100);
        return num;
    }

    /**
     * Metodo con seccion critica para aumentar el array de enteros
     *
     * @param posicion Posicion del array
     * @throws InterruptedException Excepcion de interrupcion
     */
    public static void aumentar(int posicion, int hilo) throws InterruptedException {
        // Se divide el valor aleatorio generado entre 10, para obtener la posicion del array
        posicion /= 10;
        // Cerrando semaforo
        Principal.semaforos[posicion].acquire();
        System.out.println("Hilo " + hilo + " cierra semaforo " + posicion);
        // Aumentando el valor de la posicion del array
        Principal.enteros[posicion] += 1;
        // Liberando el semaforo
        Principal.semaforos[posicion].release();
        System.out.println("Hilo " + hilo + " libera semaforo " + posicion);
        // Aumentado el contador de veces sumado
        Principal.count += 1;

        // Si se han sumado 200 veces, se ejecuta el final del programa
        if (Principal.count == 200) {
            // Acumulador de valores del array
            int contador = 0;

            // Se recorre el array
            for (int i = 0; i < 10; i++) {
                System.out.println("Posicion " + i + " con valor " + Principal.enteros[i]);
                // Se acumulan los valores en el contador
                contador += Principal.enteros[i];
            }
            // Se imprime el resutlado final
            System.out.println(contador);
        }
    }

    /**
     * Metodo que inicializa los semaforos
     */
    public static void inicializarSemaforos() {
        for (int i = 0; i < 10; i++) {
            Principal.semaforos[i] = new Semaphore(1);
            Principal.semaforos[i].release();
        }
    }
}
