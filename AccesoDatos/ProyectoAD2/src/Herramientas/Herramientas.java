package Herramientas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    /**
     * Metodo para inicializar el driver de ExistDB
     *
     * @param driver Ruta del driver
     */
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

    /**
     * Metodo para establecer una conexion con la DB especificada
     *
     * @param uri Nombre de la base de datos
     * @param user Nombre de usuario
     * @return Collection con la URI, username y password
     */
    public static Collection connectExistDB(String uri, String user) {
        // Direccion del controlador
        String Driver = "org.exist.xmldb.DatabaseImpl";
        // Ruta completa para llegar al contenedor del que se hacen consultas
        // "xmldb:exist://localhost:8080/exist/xmlrpc/db/prueba"
        String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/" + uri;
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

    /**
     * Metodo para realizar una consulta a la base de datos
     *
     * @param col Collection con la URI, username y password
     * @param consulta Consulta con sintaxis de XPath
     */
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

    /**
     * Metodo para realizar operaciones en la base de datos y retornar el
     * resultado
     *
     * @param col Collection con la URI, username y password
     * @param consulta Consulta con sintaxis de XPath
     */
    public static void operationExistDB(Collection col, String consulta) {
        try {
            XPathQueryService s = (XPathQueryService) col.getService("XPathQueryService", "1.0");
            ResourceSet operacion = s.query(consulta);

            consultExistDB(col, consulta);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Connection connectSQLite(String ruta) {
        Connection c = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite3\\" + ruta + ".db");
            System.out.println("DB abierta con exito :D");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al iniciar la DB D:");
        }
        return c;
    }

    public static void consultSQLite(String ruta, String consulta) {
        try {
            Statement stmt = connectSQLite(ruta).createStatement();

            ResultSet rs = stmt.executeQuery(consulta + ";");

            while (rs.next()) {
                int id = rs.getInt(1); // posicion que devuelve
                String nom = rs.getString(2);
                System.out.println("El id es: " + id);
                System.out.println("El nombre es: " + nom);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTableSQLite(String ruta, String create) {
        try {
            Statement stmt = connectSQLite(ruta).createStatement();

            stmt.execute(create);
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectSQLite(String ruta, String consulta, float f) {
        try {
            PreparedStatement sel = connectSQLite(ruta).prepareStatement(consulta);
            // select id from companya where salary > ? and nombre like "?"

            sel.setFloat(1, f); // El 1 corresponde a los interrogantes del where

            ResultSet r1 = sel.executeQuery();
            while (r1.next()) {
                System.out.println(r1.getInt(1)); // El 1 corresponde al numero de columnas del select
            }
            r1.close();
            sel.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insert2SQLite(String ruta, String tabla) {
        try {
            PreparedStatement insert = connectSQLite(ruta).prepareStatement("insert into " + tabla + " values(?,?)");
            insert.setInt(1, 100);
            insert.setString(2, "lenguaje");
            insert.executeUpdate();
            insert.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertArraySQLite(String ruta, String tabla) {
        String[] values = {"101", "Programacion", "102", "Script", "103", "0.0", "104", "Pargela"};
        PreparedStatement c1;
        try {
            c1 = connectSQLite(ruta).prepareStatement("insert into java2 values(?,?)");
            for (int i = 0; i < values.length; i++) {
                if (i % 2 != 0) {
                    c1.setString(2, values[i]);
                } else {
                    c1.setInt(1, Integer.parseInt(values[i]));
                }
                c1.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
