CREATE OR REPLACE PROCEDURE mostrar_tema_libro
IS
	nom_tem tema.nombre%type;
	cat_lib libro.categoria%type;
BEGIN
	SELECT tema.nombre, libro.categoria
	INTO nom_tem, cat_lib
	FROM tema
	JOIN trata_sobre
	ON tema.clavetema = trata_sobre.clavetema
	JOIN libro
	ON trata_sobre.clavelibro = libro.clavelibro
	WHERE libro.categoria like '%e%e%'
	AND length(tema.nombre) >= 7;
	
	DBMS_OUTPUT.PUT_LINE('Tema: '|| nom_tem ||', Categoria: '|| cat_lib);
END mostrar_tema_libro;
/
show errors;

SET SERVEROUTPUT ON;
BEGIN
	mostrar_tema_libro;
END;
/
