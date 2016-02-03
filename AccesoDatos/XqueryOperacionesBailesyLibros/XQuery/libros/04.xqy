xquery version "3.0";

(: Anadir a la etiqueta precio un nuevo atributo moneda='euros' :)

let $doc := //libro/precio
let $a := update insert attribute moneda{'Euro'} into $doc
return $doc