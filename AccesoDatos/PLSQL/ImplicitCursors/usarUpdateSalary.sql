set serveroutput on;
create or replace procedure mostrar(
	pemployee_id in number)
is
	nombre employees.First_name%type;
	salario number(8,2);
begin 
	select First_name, salary
	into nombre, salario
	from employees
	where employee_id = pemployee_id;

	dbms_output.put_line(nombre||','||salario);
end mostrar;
/
show errors
