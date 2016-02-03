xquery version "3.0";

(: Se ha contratado un nuevo profesor para las clases de pasodoble, anadelo <profesor>Maria Ortiz</profesor> :)

for $doc in //baile[nombre = 'Pasodoble']
let $add := update insert <profesor>{'Maria Ortiz'}</profesor> into $doc
return $doc