/*
Mostrar el codigo  del deporte donde esta inscrito el socio con nombre Alberto Paredes
*/
select cod_deporte
from deportes
where cod_deporte in (

select cod_deporte
from inscritos
where numerosocio in (

select numero
from socios
where nombre like 'Alberto Paredes'));
