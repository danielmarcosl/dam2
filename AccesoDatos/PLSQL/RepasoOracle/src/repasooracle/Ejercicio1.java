package repasooracle;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio1 {

    public static void main(String args[]) {
        /**
         * Crear un  procedimiento que muestre el nombre de los empleados que
         * tengan un sueldo mayor a 35.000 euros. Debemos mostrar mensajes
         * de ABIERTO CURSOR, CURSOR CERRADO
         */
        Herramientas.selectExplicitCursor("{call ej1(?)}");
    }
}
