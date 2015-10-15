package serializacion;

import java.io.Serializable;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class agenda implements Serializable {

    private contacto con;

    public agenda(contacto c) {
        this.con = c;
    }

    public String toString() {
        return con.nom + " " + con.telefono;
    }

}
