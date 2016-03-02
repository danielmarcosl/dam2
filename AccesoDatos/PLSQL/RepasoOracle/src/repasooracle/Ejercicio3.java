package repasooracle;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio3 {
    public static void main (String args[]) {
        /**
         * Crear un procedimiento que llamaremos INSERTP ( al que tendremos
         * que pasar los campos pertinentes para que: Comprobar que el nombre
         * de la asignatura existe en nuestra tabla asignatura y si es asi
         * insertar los campos pertinentes en la tabla profesor
         */
        Herramientas.ej3("{call insertp(?,?,?)}");
    }
}
