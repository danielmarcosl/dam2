package ftpclient;

import java.io.*;
import org.apache.commons.net.ftp.*;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class FTP_listaarchivos {

    public static void main(String[] args) {

        FTPClient cliente = new FTPClient();
        String servFTP = "192.168.35.55";
        System.out.println("Nos conectamos a: " + servFTP);
        String usuario = "parralides";
        String clave = "barco";

        try {
            cliente.connect(servFTP);
            boolean login = cliente.login(usuario, clave);

            if (login) {
                System.out.println("Login correcto...");
            } else {
                System.out.println("Login Incorrecto...");
                cliente.disconnect();
                System.exit(1);
            }

            System.out.println("Directorio actual:" + cliente.printWorkingDirectory());
            FTPFile[] files = cliente.listFiles();
            System.out.println("Ficheros en el directorio actual:" + files.length);

            //array para visualizar el tipo de fichero 
            String tipo[] = {"Fichero", "Directorio", "Enlace simb."};

            for (int i = 0; i < files.length; i++) {
                System.out.println("\t" + files[i].getName() + " => " + tipo[files[i].getType()]);
            }

            boolean logout = cliente.logout();

            if (logout) {
                System.out.println("Logout del servidor FTP...");
            } else {
                System.out.println("Error al hacer logout...");
            }
            cliente.disconnect();

            System.out.println("Desconectando...");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
