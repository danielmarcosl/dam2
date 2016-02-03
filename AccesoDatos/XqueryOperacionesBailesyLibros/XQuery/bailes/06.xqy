xquery version "3.0";

(: Debemos anadir un profesor de apoyo en las clases de baile de salas <profesor1>Pepe Bueno</profesor1> :)

for $doc in //baile[sala = '1']
let $add := update insert <profesor1>{'Pepe Bueno'}</profesor1> into $doc
return $doc