xquery version "3.0";

(: Borrar el nombre del autor que ha escrito mas de un libro :)

for $nom in //libro/autor/nombre[index-of(//libro/autor/nombre,.)[1]]
let $nom2 := //libro/autor/nombre
return if ($nom2 eq $nom) then update delete $nom2
else then

(: :return if(data($nom2) != $nom2) then update delete $nom2
else then :)

(: return if ($nom eq //libro/autor/nombre) then
 : update delete $nom
 : else then :)