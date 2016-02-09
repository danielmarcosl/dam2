/*
Mostrar los nombre distintos y el domicilio de los socios que tienen una cuota superior a la media de las cuotas de los socios inscritos
*/

select nombre,domicilio
from socios
where numero in (

select numerosocio
from inscritos
where cuotas > (

select avg(cuotas)
from inscritos));