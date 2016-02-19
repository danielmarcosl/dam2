package cifradofichero;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;


/**
 *
 * @author Daniel Marcos Lorrio
 */
public class FicheroCarga {

    public static void main(String[] args) {

        try {
            File cinf = new File("clave");
            FileInputStream cis = new FileInputStream(cinf);
            byte[] clave = new byte[(int) cinf.length()];
            cis.read(clave);

            DESKeySpec keyspec = new DESKeySpec(clave);
            SecretKeyFactory keyfac = SecretKeyFactory.getInstance("DES");
            SecretKey key = keyfac.generateSecret(keyspec);
            Cipher desCipher = Cipher.getInstance("DES");
            desCipher.init(Cipher.DECRYPT_MODE, key);

            File inf = new File("fichero_cifrado");
            FileInputStream is = new FileInputStream(inf);
            FileOutputStream os = new FileOutputStream("fichero_descifrado.txt");
            byte[] buffer = new byte[16];
            int bytes_leidos = is.read(buffer);
            String mensaje;

            while (bytes_leidos != -1) {
                os.write(desCipher.doFinal(buffer, 0, bytes_leidos));
                mensaje = new String(desCipher.doFinal(buffer, 0, bytes_leidos));
                System.out.print(mensaje);
                bytes_leidos = is.read(buffer);
            }
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
