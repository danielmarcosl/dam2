package ProyectoAD;

import java.io.*;
import java.util.*;

public class TokensCamposEnBlanco {

    public static void main(String args[]) {

        try {
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\dam2\\AccesoDatos\\ProyectoAD\\src\\ProyectoAD\\empleados.txt"));
            String linea = null;
            int count = 0;

            System.out.println("1) Mostrar todos los datos guardados en el fichero");
            while ((linea = fl.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "#");

                while (st.hasMoreTokens()) {
                    String nombre = st.nextToken();
                    String edad = st.nextToken();
                    String sueldo = st.nextToken();

                    System.out.println(nombre + " " + edad + " " + sueldo);
                }
            }
            fl.close();
            BufferedReader fl2 = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\dam2\\AccesoDatos\\ProyectoAD\\src\\ProyectoAD\\empleados.txt"));

            System.out.println("2) Mostrar el nombre de los empleados del que desconocemos su sueldo");
            while ((linea = fl2.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "#");

                while (st.hasMoreTokens()) {
                    String nombre = st.nextToken();
                    String edad = st.nextToken();
                    String sueldo = st.nextToken();

                    if (sueldo.equals(" ")) {
                        System.out.println(nombre + " " + edad + " " + sueldo);
                    }
                }
            }
            fl2.close();
            BufferedReader fl3 = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\dam2\\AccesoDatos\\ProyectoAD\\src\\ProyectoAD\\empleados.txt"));

            System.out.println("3) Contar cuántos empleados desconocemos su edad");
            while ((linea = fl3.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "#");

                while (st.hasMoreTokens()) {
                    String nombre = st.nextToken();
                    String edad = st.nextToken();
                    String sueldo = st.nextToken();

                    if (edad.equals(" ")) {
                        count++;
                    }
                }
            }
            System.out.println("Hay " + count + " empleados sin edad");
            
            fl3.close();
            BufferedReader fl4 = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Documents\\dam2\\AccesoDatos\\ProyectoAD\\src\\ProyectoAD\\empleados.txt"));
            
            System.out.println("4) Mostrar el empleado mas joven y el más viejo");
            String nombreMenor = "";
            int edadMenor = 288;
            String sueldoMenor = "";
            String nombreMayor = "";
            int edadMayor = 0;
            String sueldoMayor = "";
            while ((linea = fl4.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "#");

                while (st.hasMoreTokens()) {
                    String nombre = st.nextToken();
                    String edad = st.nextToken();
                    String sueldo = st.nextToken();

                    if (!(edad.equals(" "))) {
                        int ed = Integer.parseInt(edad);
                        if (edadMenor > ed) {
                            nombreMenor = nombre;
                            edadMenor = ed;
                            sueldoMenor = sueldo;
                        }
                        
                        if (edadMayor < ed) {
                            nombreMayor = nombre;
                            edadMayor = ed;
                            sueldoMayor = sueldo;
                        }
                    }
                }
            }
            System.out.println("El menor es " + nombreMenor + " " + edadMenor + " " + sueldoMenor);
            System.out.println("El mayor es " + nombreMayor + " " + edadMayor + " " + sueldoMayor);
            fl4.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
