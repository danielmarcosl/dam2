package repasooracle;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio2 {
    public static void main (String args[]) {
        /**
         * Creamos un procedimiento al que le pasamos una asignatura
         * y una nota y nos tiene que mostrar el nombre de todos los
         * alumnos que han sacado esa misma nota para esa misma asignatura
         */
        Herramientas.ej2("{call ej2(?,?,?)}");
    }
}
