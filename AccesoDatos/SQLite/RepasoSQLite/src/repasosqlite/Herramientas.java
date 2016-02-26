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
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al iniciar la DB D:");
        }
        return c;
    }

    public static void selectPedido(String ruta) {
        try {
            Statement stmt = connectSQLite(ruta).createStatement();
            String consulta = "select * from pedido;";
            ResultSet rs = stmt.executeQuery(consulta + ";");

            while (rs.next()) {
                int codigo_pedido = rs.getInt(1); // posicion que devuelve
                String descripcion = rs.getString(2);
                String fecha_pedido = rs.getString(3);
                String email_contacto = rs.getString(4);
                int telefono_cliente = rs.getInt(5);
                int codigo_cliente = rs.getInt(6);
                System.out.println("------------------------------------");
                System.out.println("El codigo del pedido es: " + codigo_pedido);
                System.out.println("La descripcion es: " + descripcion);
                System.out.println("La fecha del pedido es: " + fecha_pedido);
                System.out.println("El email de contacto es: " + email_contacto);
                System.out.println("El telefono de cliente es: " + telefono_cliente);
                System.out.println("El codigo de cliente es: " + codigo_cliente);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectCliente(String ruta) {
        try {
            Statement stmt = connectSQLite(ruta).createStatement();
            String consulta = "select * from cliente;";
            ResultSet rs = stmt.executeQuery(consulta + ";");

            while (rs.next()) {
                int codigo_cliente = rs.getInt(1); // posicion que devuelve
                int edad = rs.getInt(2);
                String direccion = rs.getString(3);
                System.out.println("------------------------------------");
                System.out.println("El codigo del cliente es: " + codigo_cliente);
                System.out.println("La edad es: " + edad);
                System.out.println("La direccion es: " + direccion);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectDireccion(String ruta, String s) {
        try {
            String consulta = "SELECT codigo_pedido, descripcion"
                    + " FROM pedido p"
                    + " JOIN cliente c"
                    + " ON p.codigo_cliente = c.codigo_cliente"
                    + " WHERE c.direccion = '" + s + "'";
            PreparedStatement sel = connectSQLite(ruta).prepareStatement(consulta);
            
            ResultSet r1 = sel.executeQuery();
            while (r1.next()) {
                System.out.println("-------------------------");
                System.out.println("Codigo de producto: " + r1.getInt(1));
                System.out.println("Descripcion: " + r1.getString(2));
            }
            r1.close();
            sel.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertArrayListSQLite(String db, ArrayList al, String tabla) {

        String consulta = "Insert into " + tabla
                + "(codigo_pedido, descripcion, fecha_pedido, email_contacto, telefono_cliente, codigo_cliente) values (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = connectSQLite(db).prepareStatement(consulta);

            Iterator it = al.iterator();

            while (it.hasNext()) {
                ps.setInt(1, (int) it.next());
                ps.setString(2, (String) it.next());
                ps.setString(3, (String) it.next());
                ps.setString(4, (String) it.next());
                ps.setInt(5, (int) it.next());
                ps.setInt(6, (int) it.next());
                ps.executeUpdate();
            }
            System.out.println("Insercion en Pedido finalizado con exito");
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertPedidos(String archivo, String db, String tabla) {
        ArrayList p = new ArrayList();

        try {
            BufferedReader fl = new BufferedReader(new FileReader("C:\\petra\\" + archivo));
            String linea = null;

            while ((linea = fl.readLine()) != null) {
                StringTokenizer tok = new StringTokenizer(linea, "#");

                while (tok.hasMoreTokens()) {
                    p.add(Integer.parseInt(tok.nextToken()));
                    p.add(tok.nextToken());
                    p.add(tok.nextToken());
                    p.add(tok.nextToken());
                    p.add(Integer.parseInt(tok.nextToken()));
                    p.add(Integer.parseInt(tok.nextToken()));
                }
                insertArrayListSQLite(db, p, tabla);
                p.clear();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertClientes(String db, String fi, String tabla) {
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
            System.out.println("Clientes insertados con exito");
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
