#_*_coding:utf-8_*_

futbolistas = {1 : "Casillas", 15 : "Ramos",
	3 : "Pique", 5 : "Puyol",
	11 : "Capdevila", 14 : "Xabi Alonso",
	16 : "Busquets", 8 : "Xavi Hernandez",
	18 : "Pedrito", 6 : "Iniesta",
	7 : "Villa"}
	
# Devuelve el numero de elementos que tiene el diccionario
print len(futbolistas)

# Devuelve una lista con las claves del diccionario
claves = futbolistas.keys()
print claves

# Devuelve una lista con los valores del diccionario
valores = futbolistas.values()
print valores

# Eliminamos el elemento del diccionario con clave Pedrito
for i in claves :
	if futbolistas.get(i) == "Pedrito" :
		futbolistas.pop(i)
		
# Crear una copia del diccionario anterior llamados Futbolestrellas
futbolestrellas = futbolistas.copy()
