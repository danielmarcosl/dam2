xquery version "3.0";

(: Mostrar los titulos de los libros y al final una etiqueta
 : con el numero total de libros :)

for $a in //bib
let $b := $a/count(libro)
return $a/libro/titulo | <total>{$b}</total>