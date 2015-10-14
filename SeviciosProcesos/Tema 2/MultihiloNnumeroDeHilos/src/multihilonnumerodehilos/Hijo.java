package multihilonnumerodehilos;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 14/10/2015
 */
class Hijo extends Thread {

    public int hiloActual; // Numero del hilo que se esta ejecutando actualmente
    public int resultado; // Variable que almacena el resultado de cada operacion
    public int nInicio; // Variable que almacenara el primer numero para calcular la suma
    public int nFinal; // Variable que almacenara el ultimo numero para calcular la suma

    /**
     * Crea un hilo hijo con el numero de hilo dado por el padre
     *
     * @param nHilo Numero de hilo dado por el padre
     * @param n1 Primer numero de la suma
     * @param n2 Ultimo numero de la suma
     */
    Hijo(int nHilo, int n1, int n2) {
        this.hiloActual = nHilo;
        this.nInicio = n1;
        this.nFinal = n2;
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
     * Metodo que se iniciar al lanzar los hilos. Sumara todos los numeros que
     * hay entre nInicio y nFinal, y guardara el resultado en la variable
     * resultado
     */
    public void run() {

        // Mostramos los datos del hilo
        System.out.print("Hilo " + hiloActual + " (" + nInicio + " a " + nFinal + "): ");

        // Calculamos la suma y almacenamos el resultado en la variable resultado
        resultado = Operaciones.suma(nInicio, nFinal);
    }
}
