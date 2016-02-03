xquery version "3.0";

(: Anadir al nuevo titulo un atributo traduccion='Espanol' :)

let $doc := //libro/titulo[. = 'TCP/IP Ilustrado']
let $a := update insert attribute traduccion{'Espanol'} into $doc
return $doc