xquery version "3.0";

(: carita feliz dice saca la siguiente consulta devuelve los títulos de los libros
 : en los que al menos uno de sus autores es W. Stevens :)

for $b in //libro
let $c := $b/autor
where count($c) > 2
order by $b/titulo ascending
return $b/titulo