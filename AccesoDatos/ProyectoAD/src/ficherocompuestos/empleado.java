package ficherocompuestos;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class empleado {

    String nombre;
    String apellidos;
    int edad;
    int telefono;
    
    public empleado() {
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    
    public void setApellidos(String a) {
        apellidos = a;
    }
    
    public void setEdad(int e) {
        edad = e;
    }
    
    public void setTelefono(int t) {
        telefono = t;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getTelefono() {
        return telefono;
    }
}
