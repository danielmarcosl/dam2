xquery version "3.0";

for $doc in //libro[@ano = '1999']
let $a := update insert attribute cambio{'siglo'} into $doc
return $doc