package ProyectoAD;

import java.util.HashMap;
import Herramientas.herramientas;

public class hashMapDos {

    public static void main (String args[])
    {
        // Declarar HashMap        
        HashMap <Integer,String> colores = new HashMap <Integer,String>();
        
        // Añadir las claves y valores al HashMap
        colores.put(100,"Rojo");
        colores.put(200,"Verde");
        colores.put(300,"Azul");
       
        herramientas.recorrerMapInt(colores);
        
        // Cambiar Rojo por Negro
        if (colores.containsKey(100))
        {
        colores.remove(100);
        colores.put(100,"Negro");
        }
        
        // Borrar Azul
        if (colores.containsKey(300))
        {
            colores.remove(300);
        }
        
        // Mostrar cómo queda el HashMap
        herramientas.recorrerMapInt(colores);
    }
}
