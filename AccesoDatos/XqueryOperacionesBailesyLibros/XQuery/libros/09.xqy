xquery version "3.0";

(: Anadir una nueva etiqueta <testmercado>iniciado</testmercado> en los libros que sean
 : mas modernos que el que tiene el titulo 'Advan Programming for Unix environment' :)

for $doc in //libro[titulo = 'Advan Programming for Unix environment']
let $add := update insert <testmercado>{'iniciado'}</testmercado> into $doc
return $doc