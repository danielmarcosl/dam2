xquery version "3.0";

(: Anadir un nuevo atributo en los libros publicados despues de 1999, cambio:'siglo' :)

for $doc in //libro[@ano = '1999']
let $a := update insert attribute cambio{'siglo'} into $doc
return $doc