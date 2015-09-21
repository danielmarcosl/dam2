#_*_coding:utf-8_*_

# Pedimos el año actual y lo almacenamos en una variable tipo int
anioactual = int(raw_input("Introduce el anio actual: "))

# Pedimos que introduzca otro año y lo almacenamos en una variable tipo int
aniodos = int(raw_input("Introduce otro anio: "))

# Filtramos el resultado
if anioactual > aniodos :
	# Si el año actual es mayor que el segundo año introducido
	# Calculamos y mostramos los años que faltan para llegar a él
	aniosrestantes = anioactual - aniodos
	print "Para llegar al anio " + str(anioactual) + " quedan " + str(aniosrestantes)
elif anioactual < aniodos :
	# Si el año actual es menor que el segundo año introducido
	# Calculamos y mostramos los años que han pasado de uno a otro
	aniospasados = aniodos - anioactual
	print "Desde el anio " + str(anioactual) + " han pasado " + str(aniospasados)
