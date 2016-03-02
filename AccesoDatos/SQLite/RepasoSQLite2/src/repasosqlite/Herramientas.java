package repasosqlite;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Herramientas {

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

    public static void selectDepartamento(String ruta, String consulta) {
        try {
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            ps.setString(1, "Madrid");

            ResultSet rs = ps.executeQuery();

            // Recoger valores de cada columna con estructura repetitiva
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            rs.close();
            ps.close();
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

    public static void insertDepartamento(String ruta, ArrayList ar, String consulta) {
        try {
            // Crear PreparedStatement con insert y la conexion 
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);
            // Iterar ArrayList, el preparedstatement se ejecuta con cada posicion
            Iterator it = ar.iterator();

            while (it.hasNext()) {
                ps.setInt(1, (int) it.next());
                ps.setString(2, (String) it.next());
                ps.setInt(3, (int) it.next());
                ps.executeUpdate();
            }
            // Cerrar PreparedStatement y la conexion
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertLocalidad(String ruta, ArrayList ar, String consulta) {
        try {
            // Crear PreparedStatement con insert y la conexion 
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);
            // Iterar ArrayList, el preparedstatement se ejecuta con cada posicion
            Iterator it = ar.iterator();

            while (it.hasNext()) {
                ps.setInt(1, (int) it.next());
                ps.setString(2, (String) it.next());
                ps.executeUpdate();
            }
            // Cerrar PreparedStatement y la conexion
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertEmplerido(String ruta, ArrayList ar, String consulta) {
        try {
            // Crear PreparedStatement con insert y la conexion 
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);
            // Iterar ArrayList, el preparedstatement se ejecuta con cada posicion
            Iterator it = ar.iterator();

            while (it.hasNext()) {
                ps.setInt(0, 0);
            }
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
}
