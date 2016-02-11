SET SERVEROUTPUT ON;
DECLARE
valor departments.department_id%type;
BEGIN
valor := Sueldomax(10);
dbms_output.put_line('El salario maximo es '||','|| valor);
END;
/
