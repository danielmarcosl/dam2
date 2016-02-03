xquery version "3.0";

(: Modificar el precio de los libros cuyo autor se apellida Abiteboul por un valor 0.0 :)

for $doc in //libro
let $a := update replace //autor[apellido = 'Abiteboul']/../precio with <precio>0.0</precio>
return $doc