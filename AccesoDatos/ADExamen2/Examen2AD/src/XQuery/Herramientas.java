package XQuery;

import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.modules.XPathQueryService;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Herramientas {

    private static void initializeDriver(String driver) {
        String Driver = driver;

        try {
            Class C1 = Class.forName(Driver);
            Database database = (Database) C1.newInstance();
            DatabaseManager.registerDatabase(database);
            System.out.println("Inicializado el Driver");
        } catch (Exception e) {
            System.out.println("Error al iniciar DB: " + e);
        }
    }

    public static Collection connectExistDB(String uri, String user) {
        // Direccion del controlador
        String Driver = "org.exist.xmldb.DatabaseImpl";
        // Ruta completa para llegar al contenedor del que se hacen consultas
        // "xmldb:exist://localhost:8085/exist/xmlrpc/db/prueba"
        String URI = "xmldb:exist://localhost:8085/exist/xmlrpc/db/" + uri;
        // Usuario y contrasena de la DB
        // "admin"
        String username = user;
        String password = "root";

        initializeDriver(Driver);

        Collection col = null;

        try {
            col = DatabaseManager.getCollection(URI, username, password);
            if (col == null) {
                System.out.println("La coleccion no existe.");
            } else {
                System.out.println("Conexion establecida.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return col;
    }

    public static void consultExistDB(Collection col, String consulta) {
        try {
            XPathQueryService s = (XPathQueryService) col.getService("XPathQueryService", "1.0");
            ResourceSet result = s.query(consulta);

            ResourceIterator i = result.getIterator();
            while (i.hasMoreResources()) {
                Resource r = i.nextResource();
                System.out.println(r.getContent()); // r.getId() + r.getContent()
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void operationExistDB(Collection col, String consulta) {
        try {
            XPathQueryService s = (XPathQueryService) col.getService("XPathQueryService", "1.0");
            ResourceSet operacion = s.query(consulta);

            consultExistDB(col, consulta);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
