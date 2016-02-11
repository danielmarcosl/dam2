CREATE OR REPLACE FUNCTION existe
(pid employees.employee_id%type)
RETURN boolean IS 
id employees.employee_id%type;
BEGIN
select employee_id into id from employees where pid = employee_id;
IF id = pid then
return true;
ELSE
return false;
END IF;
END existe;
/
show errors;
