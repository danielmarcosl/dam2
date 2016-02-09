/*
Encontrar el nombre y el documento de los socios que tenga una cuota media  mayor que la cuota media de los socios ordena la informacion por el nombre de manera desc
*/

select nombre, documento
from socios
where numero in (

select numerosocio
from inscritos
where avg(cuotas) > (

select avg(cuotas)
from inscritos));