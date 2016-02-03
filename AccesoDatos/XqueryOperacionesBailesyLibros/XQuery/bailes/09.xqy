xquery version "3.0";

(: Anadir una nueva sala en las clases de baile donde el numero de plazas sea mayor a 7 :)

for $doc in //baile[plazas > 7 or SALA > 7]
let $mod := update insert <sala>{'Nueva sala'}</sala> into $doc
return $doc