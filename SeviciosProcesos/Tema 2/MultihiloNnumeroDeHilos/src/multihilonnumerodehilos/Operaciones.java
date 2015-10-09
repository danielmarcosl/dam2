package multihilonnumerodehilos;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 09/10/2015
 */
public class Operaciones {

    public static int calculaDivisor(int num) {
        int divisor = 0;
        
        for (int i = 4; i < num; i++) {
            if (num % i == 0) {
                divisor = i;
                break;
            }
        }
        return divisor;
    }
    /**
     * Metodo para sumar los 10 primeros numeros naturales
     *
     * @return Resultado de la suma
     */
    public static int suma(int numMin, int numMax) {
        int suma = 0;
        for (int i = numMin; i < numMax; i++) {
            suma += i;
        }
        return suma;
    }
}
