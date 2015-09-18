package ProyectoAD;

import java.util.*;

/**
 *
 * @author Alumnot
 */
public class Profesor {

    String dni;
    char sexo;
    double sueldo;
    

    public void nuevoProfesor(String numdni, char letra, double num) {
        numdni = dni;
        letra = sexo;
        num = sueldo;
    }

    public void setdni(String numdni) {
        numdni = dni;
    }

    public void setsexo(char letra) {
        letra = sexo;
    }

    public void setsueldo(double num) {
        num = sueldo;
    }

    public String getdni(String numdni) {
        return dni;
    }

    public char getsexo(char sexo) {
        return sexo;
    }

    public double getsueldo(double sueldo) {
        return sueldo;
    }

    public void recorrerColeccion(String lista) {
 
        //Iterator it = lista.;
 
        //while (it.hasNext()) {
        //    System.out.println(it.next());
        //}
    }
}
