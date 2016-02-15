/*
Mostrar todas las oficinas donde las ventas exceden al objetivo
*/
SELECT Oficina, Ciudad, Region, Dir FROM oficinas o WHERE o.ventas > o.objetivo;