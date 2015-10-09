package multihilosumaentredoshilos;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 1 09/10/2015
 */
public class Operaciones {

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
