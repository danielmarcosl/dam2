package Tema1;

import java.io.*;
import java.util.*;
import Herramientas.Herramientas;

public class Ejercicio3 
{
    public static void main(String[] args) 
    {
        try
        {
            /*RandomAccessFile raf=new RandomAccessFile("C:\\Ejemplo\\empleado.txt","rw");
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            for(int i=0;i<5;i++)
            {
                System.out.println("Codigo: ");
                raf.writeInt(Integer.parseInt(br.readLine()));
                System.out.println("Nombre: ");
                raf.writeUTF(Herramientas.convertUTF(br.readLine(),20));
                System.out.println("Sueldo: ");
                raf.writeDouble(Double.parseDouble(br.readLine()));
            }
            raf.close();*/
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }
        
        try 
        {
            RandomAccessFile raf=new RandomAccessFile("C:\\Ejemplo\\empleado.txt","r");
            
            //lee todo el fichero
            for(int i=0;i<5;i++) 
            {
                raf.seek(i*34);
                
                int codigo=raf.readInt();
                String nombre=raf.readUTF();
                double sueldo=raf.readDouble();
            
                System.out.println(codigo+" "+nombre+" "+sueldo);
            }
            
            System.out.println("====================================");
            
            //lee el ultimo registro introducido
            raf.seek(4*34);
            int codigo=raf.readInt();
            String nombre=raf.readUTF();
            double sueldo=raf.readDouble();
            
            System.out.println(codigo+" "+nombre+" "+sueldo);
            
            System.out.println("====================================");
            
            //lee el primer y el tercer registro
            raf.seek(0*34);

            codigo=raf.readInt();
            nombre=raf.readUTF();
            sueldo=raf.readDouble();

            System.out.println(codigo+" "+nombre+" "+sueldo);
            
            raf.seek(2*34);

            codigo=raf.readInt();
            nombre=raf.readUTF();
            sueldo=raf.readDouble();

            System.out.println(codigo+" "+nombre+" "+sueldo);
            
            raf.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }
    }
}
