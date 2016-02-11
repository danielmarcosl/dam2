CREATE OR REPLACE FUNCTION sueldoMax
(pdept in departments.department_id%type)
return employees.salary%type
is sueldoAlto employees.salary%type;
BEGIN
select max(salary) into sueldoAlto from employees where department_id = pdept;
return (sueldoAlto);
EXCEPTION
when NO_DATA_FOUND then
return 0;
END sueldoMax;
/
