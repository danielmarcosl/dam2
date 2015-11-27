package practica2;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Alumno implements java.io.Serializable {

    String nombre;
    int nota;

    public void nuevoAlumno(String n, int no) {
        this.nombre = n;
        this.nota = no;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setNota(int n) {
        this.nota = n;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }
}
