package multihilonnumerodehilos;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 14/10/2015
 */
public class Operaciones {

    /**
     * Metodo que calcula el numero de hilos dividiendo el valor introducido por
     * el usuario entre posibles divisores. Cogera el primer divisor. Si el
     * numero resulta no tener divisores, creara un solo hilo
     *
     * @param num Valor introducido por el usuario en el programa principal
     * @return Numero de hilos que se crearan
     */
    public static int calculaDivisor(int num) {
        int divisor = 1;

        for (int i = 4; i < num; i++) {
            if (num % i == 0) {
                divisor = i;
                break;
            }
        }
        return divisor;
    }

    /**
     * Metodo para sumar los numeros que hay entre los dos valores introducidos
     *
     * @param numMin Primer valor
     * @param numMax Ultimo valor
     * @return Resultado de la suma
     */
    public static int suma(int numMin, int numMax) {
        int suma = 0;
        for (int i = numMin; i <= numMax; i++) {
            suma += i;
        }
        return suma;
    }
}
