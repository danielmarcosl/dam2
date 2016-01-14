xquery version "3.0";

(: Mostrar los titulos de los libros con la etiqueta <titulo> :)

let $b:= //libro/titulo
return $b