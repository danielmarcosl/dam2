package SQLite;

import java.util.ArrayList;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class EjSQLite {

    public static void main(String args[]) {

        // Insertar peliculas con Array
//        String[] p1 = {"1", "Spiderman", "N", "Hombre arana"};
//        String[] p2 = {"2", "Simpsons", "N", "Gente amarilla"};
//        String[] p3 = {"3", "South Park", "S", "Pueblo de Colorado"};
//
//        Herramientas.insertArray("pelicula", p1, "INSERT INTO pelicula VALUES(?,?,?,?)");
//        Herramientas.insertArray("pelicula", p2, "INSERT INTO pelicula VALUES(?,?,?,?)");
//        Herramientas.insertArray("pelicula", p3, "INSERT INTO pelicula VALUES(?,?,?,?)");
        // Insertar premio con fichero
//        Herramientas.insertFichero("pelicula", "prize.txt", "INSERT INTO premio VALUES(?,?,?)");
        // Insertar nominacion con ArrayList
//        ArrayList nom1 = new ArrayList();
//        ArrayList nom2 = new ArrayList();
//        ArrayList nom3 = new ArrayList();
//        
//        nom1.add(1);
//        nom1.add(11);
//        nom1.add(2);
//        
//        nom2.add(2);
//        nom2.add(22);
//        nom2.add(3);
//        
//        nom3.add(3);
//        nom3.add(33);
//        nom3.add(1);
//        
//        Herramientas.insertArrayList("pelicula", nom1, "INSERT INTO nominacion VALUES(?,?,?)");
//        Herramientas.insertArrayList("pelicula", nom2, "INSERT INTO nominacion VALUES(?,?,?)");
//        Herramientas.insertArrayList("pelicula", nom3, "INSERT INTO nominacion VALUES(?,?,?)");
//
        // Listar contenido de todas las tablas
//        Herramientas.selectPelicula("pelicula", "SELECT * FROM pelicula");
//        System.out.println("\n\n");
//        Herramientas.selectPremio("pelicula", "SELECT * FROM premio");
//        System.out.println("\n\n");
//        Herramientas.selectNominacion("pelicula", "SELECT * FROM nominacion");
//        System.out.println("\n\n");
//        Herramientas.selectPeliculaPremios("pelicula",
//                "SELECT titulooriginal\n"
//                + "FROM pelicula\n"
//                + "WHERE idpelicula = (\n"
//                + "	SELECT idpelicula\n"
//                + "	FROM premio\n"
//                + "	GROUP BY idpelicula\n"
//                + "	HAVING MAX(idpelicula)); ");
        // Borrar nominacion que contenga en titulooriginal una A
//        Herramientas.deleteNominacion("pelicula",
//                "DELETE FROM nominacion\n"
//                + "WHERE idpelicula IN (\n"
//                + "	SELECT idpelicula\n"
//                + "	FROM pelicula\n"
//                + "	WHERE UPPER(titulooriginal) LIKE ?);");

        // Actualizar premio de peliculas espanolas
        Herramientas.updatePremio("pelicula",
                "UPDATE premio\n"
                + "SET nombre = ?\n"
                + "WHERE idpelicula IN (\n"
                + "	SELECT idpelicula\n"
                + "	FROM pelicula\n"
                + "	WHERE UPPER(espanola) = ?)");
    }
}
