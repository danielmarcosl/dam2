CREATE OR REPLACE FUNCTION buscar
(pid in employees.employee_id%type) return
employees.salary%type is
sueldo employees.salary%type;
BEGIN
select salary into sueldo from employees where employee_id = pid;
return(sueldo);
EXCEPTION
when NO_DATA_FOUND then
return 0;
END buscar;
/
