xquery version "3.0";

(: Modificar el atributo cuota de la etiqueta precio por el nombre de quota :)

for $doc in //baile/precio
return update rename $doc/@cuota as 'quota'