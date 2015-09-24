package Ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio6 {

    public static void main(String args[]) {

        // Creamos los dos empleados
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();
        emp1.nuevoEmpleado("Pedro", "Mtnez");
        emp2.nuevoEmpleado("Pablo", "Fdez");

        // Creamos un contenedor
        HashMap<String, Object> list = new HashMap<String, Object>();

        list.put("34806408V", emp1);
        list.put("34186581A", emp2);

        // Mostramos el contenido del mapa
        for (Map.Entry obj1 : list.entrySet()) {
            System.out.println(((Empleado) obj1.getValue()).getNombre() + " " + ((Empleado) obj1.getValue()).getApellido());
        }
        
        // Borramos uno de los datos
        list.remove("34186581A");
    }
}
