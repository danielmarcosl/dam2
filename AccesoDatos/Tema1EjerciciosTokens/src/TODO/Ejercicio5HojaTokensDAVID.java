/*
 5. Se nos informa que tenemos un fichero llamado Mezcla.txt  
 y lo que queremos es separarlo en dos ficheros distintos: Autor.txt y correo.txt
 */
package FicherosTokens;

import java.io.*;
import java.util.StringTokenizer;
import Herramientas.*;

public class Ejercicio5HojaTokens {

    public static void main(String[] args) {

        try {
            BufferedWriter fichA = new BufferedWriter(new FileWriter("F:\\DAM\\DAM 2\\Acceso a datos\\1º Evaluacion\\Ficheros\\autor.txt"));
            BufferedWriter fichE = new BufferedWriter(new FileWriter("F:\\DAM\\DAM 2\\Acceso a datos\\1º Evaluacion\\Ficheros\\correo.txt"));
            BufferedReader fichM = new BufferedReader(new FileReader("F:\\DAM\\DAM 2\\Acceso a datos\\1º Evaluacion\\Ficheros\\Mezcla.txt"));
            String linea;
            String idioma;
            String autor;
            String titulo;
            String mail;

            while ((linea = fichM.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ":");
                while (st.hasMoreTokens()) {
                    //Se escriben los datos en el fichero autor
                    titulo = st.nextToken();
                    fichA.write(titulo);

                    idioma = st.nextToken();
                    fichA.write(idioma);

                    autor = st.nextToken();
                    fichA.write(autor);
                    fichA.newLine();
                    
                     //Se escriben los datos en el fichero mail
                    mail = st.nextToken();
                    fichE.write(mail);
                    fichE.newLine();
                }
            }

            fichE.close();
            fichA.close();
            fichM.close();

            String ruta1 = "F:\\DAM\\DAM 2\\Acceso a datos\\1º Evaluacion\\Ficheros\\correo.txt";
            String ruta2 = "F:\\DAM\\DAM 2\\Acceso a datos\\1º Evaluacion\\Ficheros\\autor.txt";

            herramientas.leerFichero(ruta1);
            herramientas.leerFichero(ruta2);

        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }

}
