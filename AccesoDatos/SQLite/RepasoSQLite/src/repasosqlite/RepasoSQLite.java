package repasosqlite;

import java.util.ArrayList;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class RepasoSQLite {

    public static void main(String[] args) {
        // Insertar desde fichero con tokens
        //Herramientas.insertTokenizerSQLite("gurru", "clientes.txt", "cliente");

        Herramientas.insertPedidos("pedidos.txt", "gurru", "pedido");
    }
}
