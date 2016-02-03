xquery version "3.0";

(: Borrar los titulos de los libros que han sido escritos por algun autor cuyo apellido sea Stevens :)

for $doc in //libro[autor/apellido = 'Stevens']
let $borrar := update delete $doc/titulo
return $doc