package multihilo;

/**
 *
 * @author Daniel Marcos Lorrio
 * @version 2 09/10/2015
 */
public class Operaciones {

    /**
     * Metodo para sumar los 10 primeros numeros naturales
     *
     * @return Resultado de la suma
     */
    public static int suma() {
        int suma = 0;
        for (int i = 1; i < 11; i++) {
            suma += i;
        }
        return suma;
    }

    /**
     * Metodo para multiplicar los 10 primeros numeros naturales
     *
     * @return Resultado de la suma
     */
    public static int multiplicacion() {
        int multiplicacion = 1;
        for (int i = 1; i < 11; i++) {
            multiplicacion *= i;
        }
        return multiplicacion;
    }

    /**
     * Metodo para sumar los 10 primeros numeros pares naturales
     *
     * @return Resultado de la suma
     */
    public static int sumaPar() {
        int contador = 0;
        int posiblePar = 1;
        int sumaPar = 0;

        while (contador < 10) {
            if (posiblePar % 2 == 0) {
                sumaPar += posiblePar;

                posiblePar++;
                contador++;
            } else {
                posiblePar++;
            }
        }
        return sumaPar;
    }

    /**
     * Metodo para sumar los 10 primeros numeros impares naturales
     *
     * @return Resultado de la suma
     */
    public static int sumaImpar() {
        int contador2 = 0;
        int posibleImpar = 0;
        int sumaImpar = 0;

        while (contador2 < 10) {
            if (posibleImpar % 2 != 0) {
                sumaImpar += posibleImpar;

                posibleImpar++;
                contador2++;
            } else {
                posibleImpar++;
            }
        }
        return sumaImpar;
    }
}
