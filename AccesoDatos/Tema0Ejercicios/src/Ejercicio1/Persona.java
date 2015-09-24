package Ejercicio1;

public class Persona {

    String rut;
    String nombre;
    
    public void nuevaPersona(String r, String n) {
        rut = r;
        nombre = n;
    }

    public String getnombre() {
        return nombre;
    }

    public String getrut() {
        return rut;
    }

    public void setnombre(String n) {
        nombre = n;
    }

    public void setrut(String r) {
        rut = r;
    }
    
    public void ToString() {
        
    }
}
