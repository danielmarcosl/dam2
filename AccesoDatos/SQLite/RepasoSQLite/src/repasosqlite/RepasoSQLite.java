package repasosqlite;

import java.util.ArrayList;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class RepasoSQLite {

    public static void main(String[] args) {
        // Inserts
        //Herramientas.insertClientes("gurru", "clientes.txt", "cliente");
        //Herramientas.insertPedidos("pedidos.txt", "gurru", "pedido");
        
        // Selects
        //Herramientas.selectCliente("gurru");
        //Herramientas.selectPedido("gurru");
        
        // Select pedidos con direccion = Madrid
        Herramientas.selectDireccion("gurru", "Madrid");
    }
}
