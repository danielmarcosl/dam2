xquery version "3.0";

(: Uno de los profesores es despedido, concretamente el profesor de pasodoble, queremos eliminar dicha etiqueta :)

for $doc in //baile[nombre = 'Pasodoble']
return update delete $doc/profesor