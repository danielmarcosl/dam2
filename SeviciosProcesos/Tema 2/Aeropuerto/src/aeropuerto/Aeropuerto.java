package aeropuerto;

import java.util.concurrent.Semaphore;

import aeropuerto.Metodos;
/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Aeropuerto {

    public static pistaAterrizaje aterrizarPista[];
    private static Semaphore semaforoPrincipal = new Semaphore(1);
    public static int aviones = 100;// Numero de aviones
    public static int pistas = 12;// Numero de pistas de aterrizaje

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int avionActual = 0; // Avion actual
        int pistaActual = 0; // Pista actual
        int tiempoActual = 0; // Tiempo de la pista

        // Array de procesos
        aterrizarPista = new pistaAterrizaje[aviones];

        // Inicia los procesos del Array
        for (avionActual = 0; avionActual < aviones; avionActual++) {
            tiempoActual = Metodos.calcularTiempo();
            aterrizarPista[avionActual] = new pistaAterrizaje(pistaActual, avionActual, tiempoActual, semaforoPrincipal);
            aterrizarPista[avionActual].start();
            
            if (pistaActual == pistas) {
                pistaActual = 0;
            } else {
                pistaActual++;
            }
        }
        // Indica al programa principal que espere a que todos los procesos acaben
        for (avionActual = 0; avionActual < aviones; avionActual++) {
            try {
                aterrizarPista[avionActual].join();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Han aterrizado todos los " + aviones + " aviones");
    }
}
