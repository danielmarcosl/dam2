package multihilo;

import multihilo.Operaciones;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 07/10/2015
 */
public class Multihilo extends Thread {

    private static int nHilos = 4; // Numero de hilos que se van a crear
    private static int hiloActual = 0; // Numero del hilo que se esta ejecutando actualmente
    private static int resultado = 0; // Variable para almacenar los resultados de las operaciones de los hilos

    /**
     * Metodo para crear nuevo hilo
     *
     * @param h Numero de hilo
     */
    public Multihilo(int h) {
        this.hiloActual = h;
    }

    /**
     * Metodo que se iniciar al lanzar los hilos. Segun el numero del hilo
     * ejecutara una accion
     */
    public void run() {
        System.out.print("Hilo " + hiloActual + ": ");
        switch (hiloActual) {
            case 0:
                resultado = Operaciones.suma();
                System.out.print("La suma de los 10 primeros numeros naturales es ");
                break;
            case 1:
                resultado = Operaciones.multiplicacion();
                System.out.print("La multiplicacion de los 10 primeros numeros naturales es ");
                break;
            case 2:
                resultado = Operaciones.sumaPar();
                System.out.print("La suma de los 10 primeros numeros pares es ");
                break;
            case 3:
                resultado = Operaciones.sumaImpar();
                System.out.print("La suma de los 10 primeros numeros impares es ");
                break;
        }
    }

    /**
     * Metodo principal, crea hilos, los lanza y devuelve el resultado de las
     * acciones que hagan
     *
     * @param args No se usa
     * @throws InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
        Multihilo hilo = null;

        while (hiloActual < nHilos) {
            hilo = new Multihilo(hiloActual);
            hilo.start();
            hilo.join();

            System.out.println(resultado);

            hiloActual++;
        }
    }
}
