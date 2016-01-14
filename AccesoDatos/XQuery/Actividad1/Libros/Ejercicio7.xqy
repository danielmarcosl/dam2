xquery version "3.0";

(: Mostrar el precio minimo y maximo de los libros :)

let $a := max(//libro/precio)
let $b := min(//libro/precio)
return <max>{$a}</max> | <min>{$b}</min>