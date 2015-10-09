package multihilo;

import multihilo.Operaciones;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 09/10/2015
 */
class Hijo extends Thread {

    public int hiloActual = 0; // Numero del hilo que se esta ejecutando actualmente
    public int resultado = 0; // Variable que almacena el resultado de cada operacion

    /**
     * Crea un hilo hijo con el numero de hilo dado por el padre
     * @param nHilo Numero de hilo dado por el padre
     */
    Hijo(int nHilo) {
        this.hiloActual = nHilo;
    }

   /**
    * Metodo para recoger el resultado desde el padre
    * @return Resultado de cada operacion
    */
    public int getResultado() {
        return resultado;
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
}
