xquery version "3.0";

(: Anadir un nuevo titulo <titulo>TCP/IP ilustrado</titulo> pero solo donde el titulo
 : sea TCP/IP Illustrated :)

let $doc := //libro[titulo = 'TCP/IP Illustrated']
let $a := update insert <titulo>{'TCP/IP Ilustrado'}</titulo> into $doc
return $doc