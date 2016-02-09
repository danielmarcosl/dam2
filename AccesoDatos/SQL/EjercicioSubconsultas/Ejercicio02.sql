/*
Selecciona el nombre de los/el socio/s que se ha inscrito en un deporte con cuota 200
*/
select nombre
from socios
where numero in (

select numerosocio
from inscritos
where cuotas = 200);
