xquery version "3.0";

(: Cambiar el nombre del baile de la profesora Laura Mendiola por el nombre de baile que imparte Maria Ortiz :)

for $d in //baile
for $laura in //baile[profesor = 'Laura Mendiola']/nombre
for $maria in //baile[profesor = 'Maria Ortiz']/nombre
let $mod := update value $d[nombre = $laura]/nombre with data($maria)
let $mod2 := update value $d[nombre = $maria]/nombre with data($laura)
return $d