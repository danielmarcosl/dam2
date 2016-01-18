xquery version "3.0";

(: Mostrar todos los anos en los que se ha publicado un
 : libro eliminando los repetidos. Etiquetalos con "ano". :)

for $a in distinct-values(//libro/@ano)
return <ano>{$a}</ano>