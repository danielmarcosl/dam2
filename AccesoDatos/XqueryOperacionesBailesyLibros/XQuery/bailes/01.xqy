xquery version "3.0";

(: Anadir un nuevo baile con id = 7, los demas datos os los podeis inventar :)

for $doc in //bailes
let $add := update insert
<baile id='7'>
<nombre>Baile del Gazpacho</nombre>
<precio cuota="mensual" moneda="euro">34</precio>
<plazas>6</plazas>
<comienzo>1/11/2012</comienzo>
<fin>1/12/2012</fin>
<profesor>Elias</profesor>
<sala>1</sala>
</baile> into $doc
return $doc