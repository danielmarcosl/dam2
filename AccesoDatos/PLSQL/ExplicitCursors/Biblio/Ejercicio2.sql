CREATE OR REPLACE PROCEDURE mostrar_autores(
	tem tema.nombre%TYPE)
IS
	nom_aut autor.nombre%TYPE;
	CURSOR c1
		IS
			SELECT DISTINCT(a.nombre)
			FROM autor a
			JOIN escrito_por ep
			ON a.claveautor = ep.claveautor
			JOIN trata_sobre ts
			ON ep.clavelibro = ts.clavelibro
			JOIN tema t
			ON ts.clavetema = t.clavetema
			WHERE t.nombre = tem;
BEGIN
	OPEN c1;
		LOOP
			FETCH c1
			INTO nom_aut;
			EXIT WHEN c1%notfound;
			DBMS_OUTPUT.PUT_LINE('Autor: '|| nom_aut);
		END LOOP;
	CLOSE c1;
END mostrar_autores;
/

SET SERVEROUTPUT ON;
BEGIN
	mostrar_autores('Aventura');
END;
/
