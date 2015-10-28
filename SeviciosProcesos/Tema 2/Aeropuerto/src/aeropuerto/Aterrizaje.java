package aeropuerto;

import java.util.concurrent.Semaphore;

import aeropuerto.Metodos;
/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Aterrizaje {

    public static int numeroAterrizaje = 0; // Inizializa el contador a 0 
}

class pistaAterrizaje extends Thread {

    private int pista;
    private Semaphore semaforo;
    private int avion;
    private int tiempo;

    // Constructor
    public pistaAterrizaje(int numeroPista, int avionActual, int tiempoActual, Semaphore semaforo) {
        this.pista = numeroPista;
        this.semaforo = semaforo;
        this.avion = avionActual;
        this.tiempo = tiempoActual;
    }
    
    public void aterrizarAvion() {
        Aterrizaje.numeroAterrizaje++;
        System.out.println("Aterrizando Avion: " + avion + " en la Pista " + pista + " con tiempo " + tiempo);
    }
    
    public void run() {
        try {
            semaforo.acquire(); // Senal Wait
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        aterrizarAvion();
        
        semaforo.release();
    }
}
