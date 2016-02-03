xquery version "3.0";

(: Vamos a cambiar en todos los bailes las fechas de inicio.
 : Concretamente el ano que queremos que sea 2016 :)

for $doc in //baile
let $comienzo := update replace $doc/comienzo with <comienzo>{concat(substring($doc/comienzo,1,4),'2016')}</comienzo>
let $final := if (string-length($doc/fin)=9) then
update replace $doc/fin with <fin>{concat(substring($doc/fin,1,5),'2016')}</fin>
else
update replace $doc/fin with <fin>{concat(substring($doc/fin,1,6),'2016')}</fin>
return $doc