xquery version "3.0";

(: carita feliz dice muestra todos los libros almacenados en la base de datos. Queremos que el resultado se guarde en una etiqueta llamada tituloresumen :)
let $a:= //libro/titulo
return <tituloresumen>{$a}</tituloresumen>