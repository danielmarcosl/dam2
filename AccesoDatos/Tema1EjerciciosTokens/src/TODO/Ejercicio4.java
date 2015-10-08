package Tema1Tokens;

import java.io.*;
import java.util.*;

public class Ejercicio4 
{
    public static void main(String[] args) 
    {
        String linea;
        int cont=0;
        
        try
        {
            BufferedReader fich=new BufferedReader(new FileReader("C:\\Ejemplo\\Frase.txt"));
            
            while((linea=fich.readLine())!=null)
            {
                StringTokenizer st=new StringTokenizer(linea);
                
                while(st.hasMoreTokens())
                {
                    String pal=st.nextToken();
                    cont++;
                }
            }
            fich.close();
            System.out.println("Numero de palabras: "+cont);
        }
        catch(Exception ex)
        {
            System.out.println("Error");
        }
    }    
}
