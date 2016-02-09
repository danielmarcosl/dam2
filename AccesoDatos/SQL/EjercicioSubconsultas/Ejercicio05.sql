/*
Nombre de los deportes que tienen una cuota superior a la cuota 4 // a la cuota del deporte futbol
*/

select nombre
from deportes
where cod_deporte in (

select cod_deporte
from inscritos
where cuotas > (

select cuotas
from inscritos
where cod_deporte = (

select cod_deporte
from deportes
where nombre = 'futbol')));