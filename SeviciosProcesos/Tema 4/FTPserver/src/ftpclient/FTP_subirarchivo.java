package ftpclient;

import java.io.*;
import org.apache.commons.net.ftp.*;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class FTP_subirarchivo {

    public static void main(String[] args) {

        FTPClient cliente = new FTPClient(); //cliente 
        String servidor = "192.168.35.55"; //servidor 
        String user = "parralides";
        String pasw = "barco";

        try {
            System.out.println("Conectandose a " + servidor);
            cliente.connect(servidor);
            boolean login = cliente.login(user, pasw);
            String direc = "servidor";

            if (login) {
                cliente.changeWorkingDirectory(direc);
                cliente.setFileType(FTP.BINARY_FILE_TYPE);

                //Stream de entrada con el fichero a subir 
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("c:\\petra\\prueba.txt"));

                    cliente.storeFile("prueba.txt", in);
                    
                //Stream de entrada con el fichero a subir 
                //in = new BufferedInputStream(new FileInputStream("c:\\petra\\gunto.jpg"));
                //cliente.storeFile("gunto.jpg", in);
                in.close(); //cerrar flujo 
                cliente.logout(); //logout del usuario 
                cliente.disconnect(); // desconexion del servidor 
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
