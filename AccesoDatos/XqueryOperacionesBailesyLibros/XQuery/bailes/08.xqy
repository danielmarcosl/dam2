xquery version "3.0";

(: Queremos modificar de sala a SALA el baile que comienza en 1/5/2016 y fin 1/12/2016 :)

for $doc in //baile[comienzo = '1/5/2016' and fin = '1/12/2016']
let $mod := update rename $doc/sala as 'SALA'
return $doc