package repasooracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Herramientas {

    private static Connection connectORACLE(String user, String pass) {
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

    public static void ej1(String llamada) {

        // Crear CallableStatement con conexion y llamada
        CallableStatement x = null;
        Connection c = null;
        try {
            c = connectORACLE("hr", "root");
            x = c.prepareCall(llamada);

            // Introducir los parametros de e/s con sus tipos
            x.registerOutParameter(1, OracleTypes.CURSOR);

            // Ejecutar CallableStatement 
            x.executeUpdate();
            ResultSet rs = (ResultSet) x.getObject(1);

            // Recoger y mostrar resultados
            while (rs.next()) {
                String nombre = rs.getString("First_Name");
                System.out.println(nombre);
            }

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

    public static void ej2(String llamada) {

        // Crear CallableStatement con conexion y llamada
        Connection c = null;
        CallableStatement x = null;
        try {
            c = connectORACLE("usu1", "root");
            x = c.prepareCall(llamada);

            // Introducir los parametros de e/s con sus tipos
            x.registerOutParameter(1, OracleTypes.CURSOR);
            x.setString(2, "Idol");
            x.setInt(3, 10);

            // Ejecutar CallableStatement
            x.executeUpdate();

            ResultSet rs = (ResultSet) x.getObject(1);

            // Recoger y mostrar resultados
            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                System.out.println(nombre);
            }

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

    public static void ej3(String llamada) {

        // Crear CallableStatement con conexion y llamada
        Connection c = null;
        CallableStatement x = null;
        try {
            c = connectORACLE("usu1", "root");
            x = c.prepareCall(llamada);

            // Introducir los parametros de e/s con sus tipos
            x.setString(1, "Plastilina");
            x.setInt(2, 5);
            x.setString(3, "Papo");

            // Ejecutar CallableStatement
            x.executeUpdate();

            System.out.println("Datos insertados");

            // Recoger y mostrar resultados
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
    
    public static void ej4(String llamada) {
        
        // Crear CallableStatement con conexion y llamada
        Connection c = null;
        CallableStatement x = null;
        try {
            c = connectORACLE("usu1", "root");
            x = c.prepareCall(llamada);
            // Introducir los parametros de e/s con sus tipos
            x.registerOutParameter(1, Types.INTEGER);
            x.setInt(2, 3);
            
            // Ejecutar CallableStatement
            x.executeUpdate();
            
            int re = x.getInt(1);
            
            System.out.println(re);
            
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
