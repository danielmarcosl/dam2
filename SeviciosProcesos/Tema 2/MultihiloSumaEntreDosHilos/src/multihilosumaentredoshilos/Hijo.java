package multihilosumaentredoshilos;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 09/10/2015
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
                resultado = Operaciones.suma(0,10);
                System.out.print("La suma de los numeros del 1 al 10 es ");
                break;
            case 1:
                resultado = Operaciones.suma(11,20);
                System.out.print("La suma de los numeros del 11 al 20 es ");
                break;
        }
    }
}
