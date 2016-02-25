package Herramientas;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
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

            // Recoger valores de cada columna con estructura repetitiva

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

    public static void inserArrayListSQLite(Connection c, ArrayList ar, String consulta) {
        try {

        // Crear PreparedStatement con insert y la conexion 
        // Iterar ArrayList, el preparedstatement se ejecuta con cada posicion
        // Cerrar PreparedStatement y la conexion

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertarMap(Connection c, Map m, String consulta) {
        try {

        // Crear PreparedStatement con insert y la conexion 
        // Iterar Map, el preparedstatement se ejecuta con cada posicion
        // Cerrar PreparedStatement y la conexion

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void intertarTokensSQL(Connection c, BufferedReader br, String consulta) {
        try {

        // Crear PreparedStatement con insert y la conexion 
        // Recorrer el fichero, el preparedstatement se ejecuta con cada posicion
        // Cerrar PreparedStatement y la conexion

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection connectORACLE(String user, String pass) {
        String host = "localhost"; // O ip como "192.168.35.185"
        String puerto = "1521";
        String sid = "XE";
        String driver = "oracle.jdbc.driver.OracleDriver";
        String ulrjdbc = "jdbc:oracle:thin:" + user + "/" + pass + "@" + host + ":" + puerto + ":" + sid;

        Connection c = null;

        try {
            Class.forName(driver).newInstance();
            c = DriverManager.getConnection(ulrjdbc);
            System.out.println("BD Abierta con exito");
        } catch (Exception e) {
            System.out.println("Error al abrir BD");
            e.printStackTrace();
        }
        return c;
    }

    public static void implicitCursorORACLE(String llamada) {

        // Crear CallableStatement con conexion y llamada
        try {
            // Introducir los parametros de e/s con sus tipos
            // Ejecutar CallableStatement 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (x != null) {
                try {
                    x.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void explicitCursorORACLE(String llamada) {

        // Crear CallableStatement con conexion y llamada
        try {
            // Introducir los parametros de e/s con sus tipos
            // Ejecutar CallableStatement 

            // Crear la coleccion ResultSet para recibir el cursor e iterar para mostrar los datos
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (x != null) {
                try {
                    x.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void callFunctionORACLE(String llamada) {

        // Crear CallableStatement con conexion y llamada
        try {
            // Introducir los parametros de e/s con sus tipos
            // Ejecutar CallableStatement 

            // Crear la coleccion ResultSet para recibir el cursor e iterar para mostrar los datos
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (x != null) {
                try {
                    x.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
