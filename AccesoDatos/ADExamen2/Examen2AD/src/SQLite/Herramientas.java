package SQLite;

import java.io.BufferedReader;
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
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public static void selectPelicula(String ruta, String consulta) {
        try {
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            ResultSet rs = ps.executeQuery();

            // Recoger valores de cada columna con estructura repetitiva
            while (rs.next()) {
                int idpelicula = rs.getInt(1);
                String titulo = rs.getString(2);
                String espanola = rs.getString(3);
                String resumen = rs.getString(4);

                System.out.println("ID: " + idpelicula
                        + "\nTitulo: " + titulo
                        + "\nEspanola: " + espanola
                        + "\nResumen: " + resumen);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectPremio(String ruta, String consulta) {
        try {
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            ResultSet rs = ps.executeQuery();

            // Recoger valores de cada columna con estructura repetitiva
            while (rs.next()) {
                int idpremio = rs.getInt(1);
                String nombre = rs.getString(2);
                int idpelicula = rs.getInt(3);

                System.out.println("Pelicula: " + idpremio
                        + "\nNombre: " + nombre
                        + "\nID pelicula: " + idpelicula);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectNominacion(String ruta, String consulta) {
        try {
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            ResultSet rs = ps.executeQuery();

            // Recoger valores de cada columna con estructura repetitiva
            while (rs.next()) {
                int idnominacion = rs.getInt(1);
                int numedic = rs.getInt(2);
                int idpelicula = rs.getInt(3);

                System.out.println("ID nominacion: " + idnominacion
                        + "\nNum Edicion: " + numedic
                        + "\nID pelicula: " + idpelicula);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectPeliculaPremios(String ruta, String consulta) {
        try {
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            ResultSet rs = ps.executeQuery();

            // Recoger valores de cada columna con estructura repetitiva
            while (rs.next()) {
                String pelicula = rs.getString(1);

                System.out.println("Pelicula con mas premios: " + pelicula);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteNominacion(String ruta, String consulta) {
        try {
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            ps.setString(1, "%A%");

            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updatePremio(String ruta, String consulta) {
        try {
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            ps.setString(1, "premioespanol");
            ps.setString(2, "S");

            ps.executeUpdate();

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

    public static void insertArray(String ruta, String[] pelicula, String consulta) {
        try {

            // Crear PreparedStatement con insert y la conexion
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            ps.setInt(1, Integer.parseInt(pelicula[0]));
            ps.setString(2, pelicula[1]);
            ps.setString(3, pelicula[2]);
            ps.setString(4, pelicula[3]);

            ps.executeUpdate();

            System.out.println("Pelicula " + pelicula[1] + " insertada con exito");

            // Cerrar PreparedStatement y la conexion
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Herramientas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertFichero(String ruta, String fichero, String consulta) {
        try {

            // Crear PreparedStatement con insert y la conexion
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            BufferedReader br = new BufferedReader(new FileReader("C:\\sqlite3\\" + fichero));

            while (br.readLine() != null) {
                ps.setInt(1, Integer.parseInt(br.readLine()));
                ps.setString(2, br.readLine());
                ps.setInt(3, Integer.parseInt(br.readLine()));

                ps.executeUpdate();

                System.out.println("Premio insertado con exito");
            }
            // Cerrar PreparedStatement y la conexion
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Herramientas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Herramientas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Herramientas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertArrayList(String ruta, ArrayList nominacion, String consulta) {
        try {

            // Crear PreparedStatement con insert y la conexion
            PreparedStatement ps = connectSQLite(ruta).prepareStatement(consulta);

            Iterator it = nominacion.iterator();

            while (it.hasNext()) {
                ps.setInt(1, (int) it.next());
                ps.setInt(2, (int) it.next());
                ps.setInt(3, (int) it.next());

                ps.executeUpdate();

                System.out.println("Nominacion insertada con exito");
            }
            // Cerrar PreparedStatement y la conexion
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Herramientas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
