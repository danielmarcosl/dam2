package ProyectoAD;

import java.util.HashMap;
import java.util.Iterator;

import Herramientas.herramientas;

public class hashMapUno {

    public static void main(String args[])
    {
        // Crear HashMap
        HashMap niveles = new HashMap();
        
        // Añadir niveles de prioridad al HashMap
        niveles.put("Urgente", 01);
        niveles.put("Importante", 02);
        niveles.put("Normal", 03);
        niveles.put("Baja Prioridad", 04);
        
        // Mostrar la información del HashMap
        //Herramientas.recorrerColeccion(niveles);
    }
}
