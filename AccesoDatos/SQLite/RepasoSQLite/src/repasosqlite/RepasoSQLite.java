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
        //Herramientas.selectDireccion("gurru", "Madrid");
        
        // Select direccion del cliente con mas de 5 pedidos
        Herramientas.selectEj3("guru", "SELECT direccion FROM cliente WHERE codigo_cliente IN ("
                + "SELECT codigo_cliente FROM pedido GROUP BY codigo_cliente HAVING COUNT(codigo_pedido) > ?)", 2);
    }
}
