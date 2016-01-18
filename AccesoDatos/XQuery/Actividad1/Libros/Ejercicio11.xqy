xquery version "3.0";

(: Mostrar los libros que tengan una "X" mayuscula o
 : minuscula en el titulo. :)

for $a in //libro
where contains($a/titulo,('x','X'))
return $a/titulo