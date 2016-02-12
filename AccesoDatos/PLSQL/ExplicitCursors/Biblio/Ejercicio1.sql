DECLARE CURSOR mostrar_tema_libro2
IS
	SELECT tema.nombre, libro.categoria
	FROM tema
	JOIN trata_sobre
	ON tema.clavetema = trata_sobre.clavetema
	JOIN libro
	ON trata_sobre.clavelibro = libro.clavelibro
	WHERE libro.categoria like '%e%e%'
	AND length(tema.nombre) >= 7;

	nom_tem tema.nombre%type;
	cat_lib libro.categoria%type;
BEGIN
	OPEN mostrar_tema_libro2;
	LOOP
		FETCH mostrar_tema_libro2
		INTO nom_tem, cat_lib;
		EXIT WHEN mostrar_tema_libro2%notfound;
		DBMS_OUTPUT.PUT_LINE('Tema: '||nom_tem||', Categoria: '|| cat_lib);
	END LOOP;
	CLOSE mostrar_tema_libro2;
END;
/
