SET SERVEROUTPUT ON;
DECLARE
valor boolean;
BEGIN
valor := existe(206);
dbms_output.put_line(
case when valor = true then 'true' else 'false' end);
END;
/
