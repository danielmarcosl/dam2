xquery version "3.0";

(: Anadir una nueva etiqueta llamada <duracionclase>1h</duracionclase> en las que
 : la quota sea igual que la quota del baile Merenge :)

for $d in //baile
for $doc in //baile[nombre = 'Merengue']/precio/@cuota
return if ($d/precio/@cuota = $doc) then
    update insert <duracionclase>{'1h'}</duracionclase> into $d

else
    $doc