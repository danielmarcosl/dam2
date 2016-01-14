xquery version "3.0";

(: Mostrar el titulo y el autor de los libros del año 2005
 : y etiquetar cada uno de ellos con 'lib2005' :)

for $b in //libro
let $c:= $b/autor
where $b[@ano = 2005]
return <lib2005>{$b/titulo | $c}</lib2005>