xquery version "3.0";

(: Borrar el nombre del autor que ha escrito mas de un libro :)

for $doc in //libro
let $aut := max(//libro/autor/string(nombre))
return update delete $doc/autor[nombre = $aut]