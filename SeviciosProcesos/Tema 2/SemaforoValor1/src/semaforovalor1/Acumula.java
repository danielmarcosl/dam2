package semaforovalor1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Acumula {

    public static int acumulador = 0; // Inicializa el acumulador a 0

}

class Sumador extends Thread {

    private int cuenta;
    private Semaphore semaforo;

    // Constructor
    Sumador(int hasta, int id, Semaphore semaforo) {
        this.cuenta = hasta;
        this.semaforo = semaforo;
    }

    // Metodo increamenta el acumulador
    public void sumar() {
        Acumula.acumulador++;
    }

    public void run() {
        for (int i = 0; i < cuenta; i++) {
            try {
                semaforo.acquire(); // Senal Wait del Semaforo. Disminuye en 1 el semaforo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sumar();

            semaforo.release(); // Senal Signal del semaforo. Incrementa en 1 el semaforo
        }
    }
}
