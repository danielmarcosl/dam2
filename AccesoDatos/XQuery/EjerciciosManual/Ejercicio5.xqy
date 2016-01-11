xquery version "3.0";

(: carita feliz dice saca todos los titulos de los libros en los que todos los autores de cada libro es W. Stevens :)
for $b in //libro
where some $a in $b/autor
satisfies ($a/apellido = "Stevens" and $a/nombre = "W.")
return $b/titulo

(: for $b in //libro
where every $a in $b/autor
satisfies ($a/apellido = "Stevens" and $a/nombre = "W.")
return $b/titulo :)