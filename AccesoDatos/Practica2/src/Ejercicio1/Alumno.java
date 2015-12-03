package Ejercicio1;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Alumno implements java.io.Serializable {

    public static String nombre;
    public static double nota;

    public Alumno(String n, double no) {
        this.nombre = n;
        this.nota = no;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setNota(double n) {
        this.nota = n;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public String toString() {
        return "nombre " + nombre + ", nota " + nota;
    }
}
