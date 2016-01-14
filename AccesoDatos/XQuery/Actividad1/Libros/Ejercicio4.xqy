xquery version "3.0";

(: Mostrar los años de publicacion, primero con "for" y luego con "let"
 : para comprobar la diferencia entre ellos.
 : Etiquetar la salida con "publicacion". :)

(: for $b in //libro
let $a := $b/@ano
order by $a ascending
return $b :)

let $a := //libro/@ano
order by $a ascending
return <algo>{data($a)}</algo>