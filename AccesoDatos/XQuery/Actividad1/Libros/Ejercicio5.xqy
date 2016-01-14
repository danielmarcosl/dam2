xquery version "3.0";

(: Mostrar cuantos libros hay, y etiquetarlo con total :)

for $a in //bib
let $b := $a/count(libro)
return <total>{$b}</total>