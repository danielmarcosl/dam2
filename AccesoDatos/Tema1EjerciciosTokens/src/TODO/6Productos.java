
/* 
    Ejercicio 6
    Crear un fichero token con código descripción y precio de distintos productos. 
    Teniendo en cuenta que habrá productos a los que no hayamos asignado descripción.
    Vamos a buscar dichos productos ( sin descripción) y los guardaremos en una 
    estructura. Una vez los hayamos añadido mostrarlos. 
 */

package Ej_FichToken;

import java.io.*;
import java.util.*;
import Herramientas.Herramientas;


public class Productos {

    public static void main(String[] args) {
        
        ArrayList<String>prod=new ArrayList<>();
        
        try{
             
            BufferedReader fich=new BufferedReader(new FileReader("/Users/juliadelasdoblas/Desktop/AccesoDatos/Mis_ficheros/Productos.txt"));
            
            String linea=null;
            System.out.println("");
            
            while((linea=fich.readLine())!=null){
                
                StringTokenizer st =new StringTokenizer(linea, "#");
                
                while(st.hasMoreTokens()){
                    String producto = st.nextToken();
                    String descrip=st.nextToken();
                    String precio=st.nextToken();
                    
                    if(descrip.equals(" ")){
                        prod.add(producto);
                    
                    }
                
                }
            
            }
            
            fich.close();
            
            Herramientas.recorrerColeccion(prod);
            
        }catch(IOException e){
        
            System.out.println("Error");
            
        }
    }
    
}
