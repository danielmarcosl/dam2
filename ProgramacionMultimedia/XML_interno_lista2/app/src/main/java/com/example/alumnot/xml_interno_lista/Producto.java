package com.example.alumnot.xml_interno_lista;

/**
 * Created by AlumnoT on 03/11/2015.
 */
public class Producto {
    private String nombre;
    private String precio;
    private String descripcion;

    public Producto(String nombre, String precio, String descripcion){
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
