package Ejercicio2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio2 {

    public static void main(String args[]) {

        // Creamos varios profesores
        Profesor prof1 = new Profesor();
        prof1.nuevoProfesor("David", 25, "Ingeniero");
        Profesor prof2 = new Profesor();
        prof2.nuevoProfesor("Douglas", 26, "Tecnico de redes");
        Profesor prof3 = new Profesor();
        prof3.nuevoProfesor("Enrique", 42, "Ingeniero");
        Profesor prof4 = new Profesor();
        prof4.nuevoProfesor("David", 26, "Filologo ingles");
        Profesor prof5 = new Profesor();
        prof5.nuevoProfesor("Enrique", 42, "Ingeniero");
        Profesor prof6 = new Profesor();
        prof6.nuevoProfesor("Agustin", 63, "Tecnico de redes");

        // Declaramos los dos maps
        HashMap<String, Object> map1 = new HashMap<String, Object>();
        HashMap<String, Object> map2 = new HashMap<String, Object>();

        // Añadimos los profesores a los maps, poniendo 3 en cada uno
        map1.put("12345678A", prof1);
        map1.put("56411501C", prof2);
        map1.put("48161616X", prof3);
        map2.put("15151651W", prof4);
        map2.put("93819832C", prof5);
        map2.put("42484465K", prof6);

        // Iteramos los dos HashMap a la vez
        for (Map.Entry obj1 : map1.entrySet()) {
            for (Map.Entry obj2 : map2.entrySet()) {
                // Almacenamos los nombres de cada HashMap en una variable distinta
                String nombre1 = ((Profesor)obj1.getValue()).getNombre();
                String nombre2 = ((Profesor)obj2.getValue()).getNombre();
                
                // Buscamos coincidencias, si existe, mostrar un mensaje
                if(nombre1 == nombre2) {
                    System.out.println("El nombre " + nombre1 + " esta repetido");
                }
                
                // Almacenamos las edades de cada HashMap en una variable distinta
                int edad1 = ((Profesor)obj1.getValue()).getEdad();
                int edad2 = ((Profesor)obj2.getValue()).getEdad();
                
                // Buscamos coincidencias, si existe, mostrar un mensaje
                if(edad1 == edad2) {
                    System.out.println("La edad " + edad1 + " esta repetida");
                }
                
                // Almacenamos las titulaciones de cada HashMap en una variable distinta
                String titulacion1 = ((Profesor)obj1.getValue()).getTitulacion();
                String titulacion2 = ((Profesor)obj2.getValue()).getTitulacion();
                
                // Buscamos coincidencias, si existe, mostrar un mensaje
                if(titulacion1 == titulacion2) {
                    System.out.println("La titulacion " + titulacion1 + " esta repetida");
                }
                
                // Buscamos profesores repetidos, si existe, mostrar un mensaje
                if((nombre1 == nombre2) && (edad1 == edad2) && (titulacion1 == titulacion2)) {
                    System.out.println("El profesor " + nombre1 + ", " + edad1 + ", " + titulacion1 + ", esta repetido");
                }
            }
        }
//        for(Map.Entry obj1 : map1.entrySet()){
//            for(Map.Entry obj2 : map2.entrySet()) {
//                System.out.println("OBJ 1 : " + obj1.getKey() + ", " + ((Profesor)obj1.getValue()).getNombre()+ ", " + ((Profesor)obj1.getValue()).getEdad()+ ", " + ((Profesor)obj1.getValue()).getTitulacion());
//                System.out.println("OBJ 2 : " + obj2.getKey() + ", " + ((Profesor)obj2.getValue()).getNombre()+ ", " + ((Profesor)obj2.getValue()).getEdad()+ ", " + ((Profesor)obj2.getValue()).getTitulacion());               
//            }
//        }
    }
}
