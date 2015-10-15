package serializacion;

public class contacto implements java.io.Serializable {

    String nom;
    int telefono;

    public contacto(String nombre, int telf) {
        nom = nombre;
        telefono = telf;
    }

    public void setnom(String nombre) {
        nombre = nom;
    }

    public void settelf(int telf) {
        telf = telefono;
    }

    public String getnom(String nombre) {
        return nom;
    }

    public int gettelf(int telf) {
        return telefono;
    }

    public String toString() {
        return "nombre " + nom + ", telefono " + telefono;
    }
}
