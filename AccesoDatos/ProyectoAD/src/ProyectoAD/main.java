/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAD;

import java.util.*;

/**
 *
 * @author Alumnot
 */
public class main {

    public static void main() {

        Profesor profe1 = new Profesor();
        Profesor profe2 = new Profesor();
        Profesor profe3 = new Profesor();
        Profesor profe4 = new Profesor();

        profe1.nuevoProfesor("45453453A", 'H', 752.78);
        profe1.nuevoProfesor("78676378X", 'M', 741.34);
        profe1.nuevoProfesor("68778667T", 'H', 737.26);
        profe1.nuevoProfesor("63753487C", 'M', 763.59);
        
        
        ArrayList listaprofe = new ArrayList();
        
        listaprofe.add(profe1);
        listaprofe.add(profe2);
        listaprofe.add(profe3);
        listaprofe.add(profe4);
        
        

        
    // generar 4 profesores que vamos a guardar en un ArrayList (listaprofe)
        // y mostrar su contenido
    // Declarar el ArrayList
        // sin tipo
        //ArrayList listaprofe = new ArrayList();
        // con tipo
        //ArrayList <tipo(obligatorio)> nombre = new ArrayList <tipo(opcional)>();
    // Añadir elementos al ArrayList
        // listaprofe.add(p1);
        // listaprofe.add(p2);
        // listaprofe.add(p3);
        // listaprofe.add(p4);
    // Recorrer Coleccion
        // recorrColeccion(listaprofe); Está creado en Herramientas
        // Consultas u operaciones
        // 1- Mostrar la info del profesor que se encuentra en la posicion 2
        // sop(listaprofe.get(2));
        // 2- Buscar el profesor de la posición 4
        // listaprofe.remove(3);
        // 3- Mostrar la lista con el borrado anterior
        // herramientas.recorrerColeccion(listaprofe);
        // 4- Añadir un nuevo profesor
        // 5- Indicar la posición donde se encuentra el nuevo profesor
        
    
    
    }
}
