xquery version "3.0";

(: Anadir un nuevo atributo en precio llamado plazo=1, o plazo=2 segun si el baile es trimestral o mensual :)

for $doc in //baile/precio
return if ($doc/@quota = 'mensual') then
           	update insert attribute plazo{'1'} into $doc
           	
else if ($doc/@quota = 'trimestral') then
	update insert attribute plazo{'2'} into $doc
else
    $doc