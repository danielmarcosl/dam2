/*
Mostrar el nombre de los deportes donde esta inscrito el socio cuyo documento de socio es 23333333. Ordena la salida de manera ascendente
*/

select nombre
from deportes
where cod_deporte in (

select cod_deporte
from inscritos
where numerosocio = (

select numero
from socios
where documento = 23333333));