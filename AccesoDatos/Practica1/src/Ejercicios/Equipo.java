package Ejercicios;

public class Equipo {
    
    String nombre;
    Integer cantidad;
    double precio;

    public void nuevoEquipo(String n, Integer c, double p) {
        nombre = n;
        cantidad = c;
        precio = p;
    }
    
    public double getPrecio() {
        return precio;
    }

}
