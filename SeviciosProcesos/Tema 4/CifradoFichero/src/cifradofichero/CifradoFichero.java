package cifradofichero;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class CifradoFichero {

    public static void main(String[] args) {
        try {
            System.out.println("Obteniendo generador de claves con cifrado DES");
            KeyGenerator keygen = KeyGenerator.getInstance("DES");
            System.out.println("Generando clave");
            SecretKey key = keygen.generateKey();
            System.out.println("Obteniendo objeto Cipher con cifrado DES");
            Cipher desCipher = Cipher.getInstance("DES");
            System.out.println("Configurando Cipher para encriptar");
            desCipher.init(Cipher.ENCRYPT_MODE, key);

            System.out.println("Abriendo el fichero");
            File inf = new File("fichero_prueba.txt");
            FileInputStream is = new FileInputStream(inf);

            System.out.println("Abriendo el fichero cifrado");
            FileOutputStream os = new FileOutputStream("fichero_cifrado");
            System.out.println("Cifrando el fichero...");
            
            byte[] buffer = new byte[8];
            int bytes_leidos = is.read(buffer);

            while (bytes_leidos != -1) {
                os.write(desCipher.doFinal(buffer, 0, bytes_leidos));
                bytes_leidos = is.read(buffer);
            }

            os.close();

            System.out.println("Obteniendo factoría de claves con cifrado DES");
            SecretKeyFactory keyfac = SecretKeyFactory.getInstance("DES");
            System.out.println("Generando keyspec");
            DESKeySpec keyspec = (DESKeySpec) keyfac.getKeySpec(key, DESKeySpec.class);
            System.out.println("Salvando la clave en un fichero");
            FileOutputStream cos = new FileOutputStream("clave");

            cos.write(keyspec.getKey());
            cos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
