xquery version "3.0";

(: Anadir en la editorial del autor cuyo nombre sea Dan una fecha_creacion='01/01/2016' :)

for $doc in //libro[autor/nombre = 'Dan']
let $add := update insert attribute fecha_creacion{'01/01/2016'} into $doc/editorial
return $doc