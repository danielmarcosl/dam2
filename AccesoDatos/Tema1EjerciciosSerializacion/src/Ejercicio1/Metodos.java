package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Alumnot
 */
public class Metodos {

    public static void setPersonaDatos(Persona p) throws IOException {
        // Creamos un escaner para permitir al usuario introducir datos
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        // Pedimos al usuario que meta los datos de la persona
        System.out.print("Introduce el nombre: ");
        p.setNombre(teclado.readLine());
        System.out.print("Introduce el apellido: ");
        p.setApellidos(teclado.readLine());
        System.out.print("Introduce el DNI: ");
        p.setDNI(teclado.readLine());
        System.out.print("Introduce la edad: ");
        p.setEdad(Integer.parseInt(teclado.readLine()));
    }
}
