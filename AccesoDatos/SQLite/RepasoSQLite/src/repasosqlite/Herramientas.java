/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasosqlite;

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
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

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

    public static void insertArrayListSQLite(String db, ArrayList al, String tabla) {

        String consulta = "Insert into " + tabla + "(id, nombre) values (?,?)";

        try {
            PreparedStatement ps = connectSQLite(db).prepareStatement(consulta);

            Iterator it = al.iterator();

            while (it.hasNext()) {
                ps.setInt(1, (int) it.next());
                ps.setString(2, (String) it.next());
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertHashMapSQLite(String db, HashMap m) {

        String consulta = "insert into eje1(id, nombre) values (?,?)";

        try {
            PreparedStatement ps = connectSQLite(db).prepareStatement(consulta);

            Iterator it = m.keySet().iterator();
            while (it.hasNext()) {
                int clave = (Integer) it.next();
                String valor = (String) m.get(clave);

                ps.setInt(1, clave);
                ps.setString(2, valor);
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertTokenizerSQLite(String db, String fi, String tabla) {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("C:\\petra\\" + fi));
            String consulta = "INSERT INTO " + tabla + " VALUES(?,?,?)";
            String linea = null;
            PreparedStatement ps = connectSQLite(db).prepareStatement(consulta);

            // Se almacenan las lineas mientras haya lineas
            while ((linea = entrada.readLine()) != null) {
                // Declaracion de StringTokenizer para la linea almacenada
                // con el token !
                StringTokenizer tok = new StringTokenizer(linea, "@");
                // Mientras haya tokens, añadirlos al ArrayList<Integer>
                while (tok.hasMoreTokens()) {
                    int cod = Integer.parseInt(tok.nextToken());
                    int edad = Integer.parseInt(tok.nextToken());
                    String dir = tok.nextToken();

                    ps.setInt(1, cod);
                    ps.setInt(2, edad);
                    ps.setString(3, dir);
                    ps.executeUpdate();
                }
            }
            // Cerrar el fichero
            entrada.close();
            // SI ha habido un error, mostrarlo
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
