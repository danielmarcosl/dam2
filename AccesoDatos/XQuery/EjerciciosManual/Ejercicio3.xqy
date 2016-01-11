xquery version "3.0";

(: carita feliz dice saca los títulos de los libros del año 2.000 :)
for $b in //libro
where $b/@ano="2000"
return $b/titulo

(: for $b in //libro
let $c := $b/autor
where count($c) > 2
order by $b/titulo ascending
return $b/titulo :)