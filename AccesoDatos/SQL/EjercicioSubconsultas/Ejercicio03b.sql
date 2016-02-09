/*
Mostrar el nombre de los deportes donde esta inscrito el socio cuyo documento de socio es 23333333. Ordena la salida de manera ascendente
*/

select d.nombre
from deportes d, inscritos i, socios s where
d.cod_deporte = i.cod_deporte and s.numero = i.numerosocio and
s.documento = 23333333
order by d.nombre;