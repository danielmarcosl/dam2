xquery version "3.0";

(: carita feliz dice obten una lista ordenada de apellidos de todos los autores y editores :)
for $b in distinct-values(//libro/autor/apellido | //libro/editor/apellido)
order by $b ascending
return <apellido-ordenado>{$b}</apellido-ordenado>