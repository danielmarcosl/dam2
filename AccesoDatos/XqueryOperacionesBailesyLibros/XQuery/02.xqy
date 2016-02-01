xquery version "3.0";

let $doc := //libro[titulo = 'TCP/IP Illustrated']
let $a := update insert <titulo>{'TCP/IP Ilustrado'}</titulo> into $doc
return $doc