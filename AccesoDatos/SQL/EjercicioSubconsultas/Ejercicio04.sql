/*
Nombre de los socios inscritos en los deportes de tenis o en  el futbol  o en ambos
*/

select nombre
from socios
where numero in (

select numerosocio
from inscritos
where cod_deporte in (

select cod_deporte
from deportes
where nombre in ('tenis','futbol')));