package comienzoclase;

import static java.lang.Thread.sleep;

class Bienvenida {

    boolean clase_comenzada;

    public Bienvenida() {
        this.clase_comenzada = false;
    }

    //hasta que el profe no salude no empieza la clase por lo que los alumnos esperan con un wait
    public synchronized void saludarProfesor(String nombreA) {

        try {
            sleep(1000);
            while (clase_comenzada == false) {
                wait();
            }
            System.out.println("Soy " + nombreA + ". Buenos días, profesor.");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    //Cuando el profe saluda avisa a los alumnos con notifyall de su llegada
    public synchronized void llegadaProfesor(String nombre) {

        System.out.println("Buenos dias a todos. soy el profe " + nombre);
        this.clase_comenzada = true;
        notifyAll();
    }
}

class Alumno extends Thread {

    String nombre;
    Bienvenida saludo;

    public Alumno(String nombre, Bienvenida mensajealumno) {
        this.nombre = nombre;
        this.saludo = mensajealumno;
    }

    public void run() {

        System.out.println("Alumno" + this.nombre + " llego.");

        try {
            Thread.sleep(1000);
            saludo.saludarProfesor(nombre);
        } catch (InterruptedException ex) {
            System.err.println("Thread alumno interrumpido");
            System.exit(-1);
        }
    }
}

class Profesor extends Thread {

    String nombre;
    Bienvenida saludo;

    public Profesor(String nombre, Bienvenida mensajeprofesor) {

        this.nombre = nombre;
        this.saludo = mensajeprofesor;
    }

    public void run() {

        System.out.println(nombre + " llego.");

        try {
            Thread.sleep(1000);
            saludo.llegadaProfesor(nombre);
        } catch (InterruptedException ex) {
            System.err.println("Thread profesor interrumpido ");
            System.exit(-1);
        }
    }
}

public class ComienzoClase {

    public static void main(String[] args) {

        //Objeto compartido
        Bienvenida b = new Bienvenida();
        String nombrealumno;
        int n_alumnos = 10; //int n_alumnos = Integer.parseInt(args[0]);

        for (int i = 0; i < n_alumnos; i++) {
            nombrealumno = "alumno-" + i;
            new Alumno(nombrealumno, b).start();
        }
        Profesor profesor = new Profesor("Jose Manuel", b);
        profesor.start();
    }
}
