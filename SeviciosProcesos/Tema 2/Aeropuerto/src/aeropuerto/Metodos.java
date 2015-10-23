package aeropuerto;

import java.util.Random;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Metodos {

    /**
     * Calcula uno numero entre 1 y 5 que simboliza el tiempo
     *
     * @return Integer entre 1 y 5
     */
    public static int calcularTiempo() {

        Random generator = new Random();
        int tiempo = generator.nextInt(10) + 1;

        return tiempo;
    }
}
