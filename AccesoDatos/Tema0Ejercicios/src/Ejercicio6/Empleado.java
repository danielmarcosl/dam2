package Ejercicio6;

public class Empleado {

    String nombre;
    String apellido;
    
    public void nuevoEmpleado(String n, String a) {
        nombre = n;
        apellido = a;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
}
