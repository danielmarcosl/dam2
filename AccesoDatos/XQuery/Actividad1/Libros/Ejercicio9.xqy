xquery version "3.0";

(: Mostrar los libros escritos en anos que terminen en "3" :)

for $a in //libro
where ends-with($a/@ano,3)
return $a/titulo