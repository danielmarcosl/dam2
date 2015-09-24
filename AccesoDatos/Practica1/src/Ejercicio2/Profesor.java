package Ejercicio2;

public class Profesor {

    String nombre;
    int edad;
    String titulacion;
    
    public void nuevoProfesor(String n, int e, String t) {
        nombre = n;
        edad = e;
        titulacion = t;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getTitulacion() {
        return titulacion;
    }
}
