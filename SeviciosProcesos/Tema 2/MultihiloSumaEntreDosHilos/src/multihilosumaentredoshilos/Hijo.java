package multihilosumaentredoshilos;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 09/10/2015
 */
class Hijo extends Thread {

    public int hiloActual = 0; // Numero del hilo que se esta ejecutando actualmente
    public int resultado = 0; // Variable que almacena el resultado de cada operacion
    public int numero = 0; // Variable que almacenara el numero para calcular la suma

    /**
     * Crea un hilo hijo con el numero de hilo dado por el padre
     *
     * @param nHilo Numero de hilo dado por el padre
     * @param n Numero para calcular la suma
     */
    Hijo(int nHilo, int n) {
        this.hiloActual = nHilo;
        this.numero = n;
    }

    /**
     * Metodo para recoger el resultado desde el padre
     *
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
        int num1 = numero / 2;
        int num2 = numero;

        System.out.print("Hilo " + hiloActual + ": ");
        switch (hiloActual) {
            case 0:
                resultado = Operaciones.suma(0, num1);
                System.out.print("La suma de los numeros del 1 al 10 es ");
                break;
            case 1:
                resultado = Operaciones.suma((num1 + 1), num2);
                System.out.print("La suma de los numeros del 11 al 20 es ");
                break;
        }
    }
}
