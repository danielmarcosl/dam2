xquery version "3.0";

(: Mostrar el titulo del libro, su precio y su precio con el IVA
 : incluido, cada uno con su propia etiqueta.
 : Ordenalos por precio con IVA :)

for $a in //libro
order by $a/precio ascending
return <libro>{$a/titulo | $a/precio | <precioIVA>{$a/precio * 1.21}</precioIVA>}</libro>