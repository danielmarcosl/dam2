xquery version "3.0";

let $doc := //libro/precio
let $a := update insert attribute moneda{'Euro'} into $doc
return $doc