package repasosqlite;

import java.util.ArrayList;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio5 {

    public static void main(String[] args) {

//        Herramientas.createTableSQLite("repaso2", "CREATE TABLE localidad(\n"
//                + "location_id INT(2) PRIMARY KEY,\n"
//                + "ciudad VARCHAR(10)\n"
//                + ");");
//
//        Herramientas.createTableSQLite("repaso2", "CREATE TABLE departamento(\n"
//                + "department_id INT(2) PRIMARY KEY,\n"
//                + "department_name VARCHAR(10),\n"
//                + "location_id INT(2),\n"
//                + "CONSTRAINT fk_empleado_location_id FOREIGN KEY (location_id) REFERENCES localidad(location_id)\n"
//                + ");");
//
//        Herramientas.createTableSQLite("repaso2", "CREATE TABLE emplerido(\n"
//                + "employee_id INT(2) PRIMARY KEY,\n"
//                + "last_name VARCHAR(10),\n"
//                + "commision INT(2),\n"
//                + "department_id INT(2),\n"
//                + "CONSTRAINT fk_empleado_department_id FOREIGN KEY (department_id) REFERENCES departamento(department_id)\n"
//                + ");");
//
//        ArrayList localidad = new ArrayList();
//
//        localidad.add(1);
//        localidad.add("Madrid");
//
//        Herramientas.insertLocalidad("repaso2", localidad, "INSERT INTO localidad(location_id, ciudad) VALUES (?,?)");
//
//        ArrayList departamento = new ArrayList();
//
//        departamento.add(11);
//        departamento.add("rrhh");
//        departamento.add(1);
//        Herramientas.insertDepartamento("repaso2", departamento, "INSERT INTO departamento(department_id, department_name, location_id) VALUES (?,?,?)");
//
//        Herramientas.selectDepartamento("repaso2", "SELECT department_name\n"
//                + "FROM departamento\n"
//                + "WHERE location_id = (\n"
//                + "SELECT location_id\n"
//                + "FROM localidad\n"
//                + "WHERE ciudad = ?)");
    }
}
