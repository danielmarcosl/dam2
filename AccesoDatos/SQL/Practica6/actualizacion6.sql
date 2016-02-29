/*
Modifica el nombre de todas las tablas,
por los que se te indican a continuacion:
Proyectos -> Planes
Elementos -> Instrumentos
Alumnos -> Estudiante
Trabajos -> Tareas;
*/

RENAME TABLE proyectos TO planes;
RENAME TABLE elementos TO instrumentos;
RENAME TABLE alumnos TO estudiante;
RENAME TABLE trabajos TO tareas;
