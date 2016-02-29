/*
Modifica el campo descripcion poniendo "Actividad
Practica" en el proyecto con codigo 2 
*/

ALTER TABLE proyectos
CHANGE descripcion actividad_practica VARCHAR(20);
