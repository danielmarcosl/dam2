xquery version "3.0";

(: Queremos que todas las monedas sean euros :)

for $doc in //baile/precio
let $mod := update value $doc/@moneda with 'euros'
return $doc