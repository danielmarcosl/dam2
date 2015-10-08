package Ejercicio1;

/**
 *
 * @author Alumnot
 */
public class Persona {

    String nombre;
    String apellidos;
    String dni;
    int edad;
    
    public void nuevaPersona(String nom, String ape, String d, int e) {
        nombre = nom;
        apellidos = ape;
        dni = d;
        edad = e;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String getDNI() {
        return dni;
    }
    
    public int getEdad() {
        return edad;
    }
}
