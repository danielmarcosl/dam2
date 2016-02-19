CREATE OR REPLACE PROCEDURE mostrar_temas
IS
	nom_tem tema.nombre%TYPE;
	cat_lib libro.categoria%TYPE;
	CURSOR c1
		IS
			SELECT tema.nombre, libro.categoria
			FROM tema
			JOIN trata_sobre
			ON tema.clavetema = trata_sobre.clavetema
			JOIN libro
			ON trata_sobre.clavelibro = libro.clavelibro
			WHERE libro.categoria LIKE '%e%e%'
			AND LENGTH(tema.nombre) >= 7;
BEGIN
OPEN c1;
	LOOP
		FETCH c1
		INTO nom_tem, cat_lib;
		EXIT WHEN c1%notfound;
		DBMS_OUTPUT.PUT_LINE('Tema: '||nom_tem||', Categoria: '|| cat_lib);
	END LOOP;
	CLOSE c1;
END mostrar_temas;
/

SET SERVEROUTPUT ON;
BEGIN
	mostrar_temas;
END;
/
