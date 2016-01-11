xquery version "3.0";

(: carita feliz dice saca los títulos de los libros que tengan más de dos autores ordenados por su título :)
for $b in //libro
where $b/count(autor)>=2
return $b/titulo