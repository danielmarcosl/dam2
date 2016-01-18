xquery version "3.0";

(: Mostrar los libros cuyo precio sea menor o igual a 30
 : Primero incluyendo la condicion en la clausula "where"
 : y luego en la ruta del Xpath :)

(:  :let $b:= //libro
where $b/precio <= 30
return $b/titulo :)

let $a:= //libro[precio < 30]/titulo
return $a