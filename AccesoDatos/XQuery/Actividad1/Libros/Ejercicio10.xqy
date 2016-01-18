xquery version "3.0";

(: Mostrar los libros cuya categoria empiece por "C" :)

for $a in //libro/titulo
where starts-with($a,'C')
return $a