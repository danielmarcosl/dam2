/*
Ejercicio 5.Repetir el ejercicio  4 pero ahora en vez de arraylist  modifica el código para que sea un hashmap  con la clave <1,titulo>
 */
package EjerciciosFicheros;

import Herramientas.Herramientas;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Francisco
 */
public class Ejercicio5Tema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
                        final long TAMREG=26;
        
                        HashMap<Integer,String> bilbo = new HashMap();
                        
                        bilbo.put(1,"Libro1");
                        bilbo.put(2,"Libro2");
                        bilbo.put(3,"Libro3");
                        bilbo.put(4,"Libro4");
                        bilbo.put(5,"Libro5");
                        try{
                        RandomAccessFile fich= new RandomAccessFile("F:\\biblioteca.txt","rw");
                        
                        recorrerColeccion(bilbo,fich);
                        
                        leerFichero("F:\\biblioteca.txt",TAMREG,5);
                        
                        
                        
        
                        }catch(IOException e){
            System.out.println("Error entrada/salida");
            
        }
    }
    
       
     public static void recorrerColeccion(Map C,RandomAccessFile r) throws IOException{
        String linea="";
        Iterator it = C.keySet().iterator();
            while (it.hasNext()){
                Integer clave=(Integer)it.next();
                r.writeInt(clave);
                linea=(String)C.get(clave);
                r.writeUTF(Herramientas.convertUTF(linea,20)); 
                              
             }          
            r.close();  
    }
          
     
      public static void leerFichero(String ruta,long tam,long regs) throws FileNotFoundException, IOException{ 
                RandomAccessFile fiche=new RandomAccessFile(ruta,"r");
                    String titulo;
                    int codigo;
                        for(int i=0;i<regs;i++){
                            fiche.seek(i*tam);
                            codigo=fiche.readInt();
                            titulo=fiche.readUTF();
                            System.out.println("Titulo del libro con el codigo"+codigo+" es:"+titulo);
                        }
                        fiche.seek(0*tam);
                        codigo=fiche.readInt();
                        titulo=fiche.readUTF();
                        System.out.println("El titulo del primer libro con el codigo "+codigo+ " es: "+titulo);
                        fiche.seek(tam*(regs-1));
                        codigo=fiche.readInt();
                        titulo=fiche.readUTF();
                        System.out.println("El titulo del ultimo libro con el codigo "+codigo+ " es: "+titulo);
                        
                        
   }
                    
        
        
        
    
    
}
