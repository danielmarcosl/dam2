xquery version "3.0";

(: Modificar la afiliación del editor en las que todas las
 : editoriales sean Kluwer Academic editorials :)

for $doc in //libro
let $mod := update replace //editorial[.= 'Kluwer Academic editorials']/../editor/afiliacion
with <afiliacion>nueva afiliacion</afiliacion>
return $doc