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
        int tiempo = generator.nextInt(5) + 1;

        return tiempo;
    }
    
    public static int calcularSleep(int tiempo) {
        int tiempoDormido = 0;
        
        switch(tiempo) {
            case 1:
                tiempoDormido = 100;
                break;
            case 2:
                tiempoDormido = 200;
                break;
            case 3:
                tiempoDormido = 300;
                break;
            case 4:
                tiempoDormido = 400;
                break;
            case 5:
                tiempoDormido = 500;
                break;
        }
        return tiempoDormido;
    }
}
