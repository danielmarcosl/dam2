create or replace procedure actualizarsalario(
	pemployee_id in number)
is
	nombre employees.First_name%type;
	salario number(8,2);
begin
	update employees
	set salary=salary+100
	where employee_id=pemployee_id;

	select first_name, salary
	into nombre, salario
	from employees
	where employee_id=pemployee_id;
end actualizarsalario;
/
show errors
