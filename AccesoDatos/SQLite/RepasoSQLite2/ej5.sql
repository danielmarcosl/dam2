CREATE TABLE departamento(
department_id INT(2) PRIMARY KEY,
department_name VARCHAR(10),
location_id INT(2)
);

CREATE TABLE localidad(
location_id INT(2) PRIMARY KEY,
ciudad VARCHAR(10)
);

CREATE TABLE emplerido(
employee_id INT(2) PRIMARY KEY,
last_name VARCHAR(10),
commision INT(2),
department_id INT(2),
location_id INT(2),
CONSTRAINT fk_empleado_department_id FOREIGN KEY (department_id) REFERENCES departamento(department_id),
CONSTRAINT fk_empleado_location_id FOREIGN KEY (location_id) REFERENCES localidad(location_id)
);
