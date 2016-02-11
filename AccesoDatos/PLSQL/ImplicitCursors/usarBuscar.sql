SET SERVEROUTPUT ON;
DECLARE
valor employees.salary%type;
BEGIN
valor := buscar(200);
dbms_output.put_line('El valor es '||','|| valor);
END;
/
