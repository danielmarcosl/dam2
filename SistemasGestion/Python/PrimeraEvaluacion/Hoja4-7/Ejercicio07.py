#_*_coding:utf-8_*_

import os

dorsal_moto_nombre = {0:"Nipon",1:"John Smith"}
dorsal_moto_nacionalidad = {0:"Japonesa",1:"UK"}
dorsal_moto_marca = {0:"Yamaha",1:"Mercadona"}
dorsal_moto_posicion_clasificacion_general = {0:2,1:3}
dorsal_coche_nombre_piloto = {0:"Pepe",1:"Moe"}
dorsal_coche_nombre_copiloto = {0:"Luis",1:"Homer"}
dorsal_coche_nacionalidad_piloto = {0:"Italiano",1:"Noruego"}
dorsal_coche_nacionalidad_copiloto = {0:"Luxemburguense",1:"Finlandes"}
dorsal_coche_marca = {0:"Kuruma",1:"Ford"}
dorsal_coche_posicion_clasificacion_general = {0:4,1:7}

operacion = 0
clear = lambda: os.system('cls')

while operacion != 288 :
	print '''Bienvenidoal menu del Rally Dakar
	
Selecciona una opcion:

1. Motos
2. Coches
288. Salir
'''
	operacion = int(raw_input("Tu opcion: "))
	
	if operacion == 1 :
		clear()
		print '''Bienvenido al menu de motos del Rally Dakar

Selecciona una opcion:

1. Mostrar
2. Anadir
3. Modificar
5. Atras
'''

		operacion = int(raw_input("Tu opcion: "))
	
		if operacion == 1:
			clear()
			print '''Bienvenido al menu de motos del Rally Dakar
		
1. Consultar todos los datos de motos
2. Consultar nombres y nacionalidades
3. Consultar marcas de motos
4. Consultar clasificaciones de motos
16. Atras
'''

			operacion = int(raw_input("Tu opcion: "))

			if operacion == 1 :
				clear()
				print dorsal_moto_nombre
				print dorsal_moto_nacionalidad
				print dorsal_moto_marca
				print dorsal_moto_posicion_clasificacion_general
			elif operacion == 2 :
				clear()
				print dorsal_moto_nombre
				print dorsal_moto_nacionalidad
			elif operacion == 3 :
				clear()
				print dorsal_moto_marca
			elif operacion == 4 :
				clear89
				print dorsal_moto_posicion_clasificacion_general
		elif operacion == 2 :
			clear()
			print '''Bienvenido al menu de motos del Rally Dakar
Aniade una nueva entrada'''

			dorsal_moto_nombre[(len(dorsal_moto_nombre)+1)] = raw_input("Nombre: ")
			dorsal_moto_nacionalidad[(len(dorsal_moto_nacionalidad)+1)] = raw_input("Nacionalidad: ")
			dorsal_moto_marca[(len(dorsal_moto_marca)+1)] = raw_input("Marca: ")
			dorsal_moto_posicion_clasificacion_general[(len(dorsal_moto_posicion_clasificacion_general)+1)] = raw_input("Posicion: ")

		elif operacion == 3 :
			clear()
			print '''Bienvenido al menu de motos del Rally Dakar
Que entrada desea modificar?'''
			print dorsal_moto_nombre
			print dorsal_moto_nacionalidad
			print dorsal_moto_marca
			print dorsal_moto_posicion_clasificacion_general
			
			operacion = int(raw_input("Tu opcion: "))
			
			dorsal_moto_nombre[operacion] = raw_input("Nombre: ")
			dorsal_moto_nacionalidad[operacion] = raw_input("Nacionalidad: ")
			dorsal_moto_marca[operacion] = raw_input("Marca: ")
			dorsal_moto_posicion_clasificacion_general[operacion] = raw_input("Posicion: ")
				
	elif operacion == 2 :
		clear()
		print '''Bienvenido al menu de coches del Rally Dakar

Selecciona una opcion:

1. Mostrar
2. Anadir
3. Modificar
5. Atras
'''

		operacion = int(raw_input("Tu opcion: "))
	
		if operacion == 1:
			clear()
			print '''Bienvenido al coches de motos del Rally Dakar
		
1. Consultar todos los datos de coches
2. Consultar nombres y nacionalidades
3. Consultar marcas de coches
4. Consultar clasificaciones de coches
16. Atras
'''

			operacion = int(raw_input("Tu opcion: "))

			if operacion == 1 :
				clear()
				print dorsal_coche_nombre_piloto
				print dorsal_coche_nombre_copiloto
				print dorsal_coche_nacionalidad_piloto
				print dorsal_coche_nacionalidad_copiloto
				print dorsal_coche_marca
				print dorsal_coche_posicion_clasificacion_general
			elif operacion == 2 :
				clear()
				print dorsal_coche_nombre_piloto
				print dorsal_coche_nombre_copiloto
				print dorsal_coche_nacionalidad_piloto
				print dorsal_coche_nacionalidad_copiloto
			elif operacion == 3 :
				clear()
				print dorsal_coche_marca
			elif operacion == 4 :
				clear()
				print dorsal_coche_posicion_clasificacion_general
				
		elif operacion == 2 :
			clear()
			print '''Bienvenido al menu de coches del Rally Dakar
Aniade una nueva entrada'''

			dorsal_coche_nombre_piloto[(len(dorsal_coche_nombre_piloto)+1)] = raw_input("Nombre: ")
			dorsal_coche_nombre_copiloto[(len(dorsal_coche_nombre_copiloto)+1)] = raw_input("Nombre: ")
			dorsal_coche_nacionalidad_piloto[(len(dorsal_coche_nacionalidad_piloto)+1)] = raw_input("Nacionalidad: ")
			dorsal_coche_nacionalidad_copiloto[(len(dorsal_coche_nacionalidad_copiloto)+1)] = raw_input("Nacionalidad: ")
			dorsal_coche_marca[(len(dorsal_coche_marca)+1)] = raw_input("Marca: ")
			dorsal_coche_posicion_clasificacion_general[(len(dorsal_coche_posicion_clasificacion_general)+1)] = raw_input("Posicion: ")

		elif operacion == 3 :
			clear()
			print '''Bienvenido al menu de coches del Rally Dakar
Que entrada desea modificar?'''
			print dorsal_coche_nombre_piloto
			print dorsal_coche_nombre_copiloto
			print dorsal_coche_nacionalidad_piloto
			print dorsal_coche_nacionalidad_copiloto
			print dorsal_coche_marca
			print dorsal_coche_posicion_clasificacion_general
			
			operacion = int(raw_input("Tu opcion: "))
			
			dorsal_coche_nombre_piloto[operacion] = raw_input("Nombre: ")
			dorsal_coche_nombre_copiloto[operacion] = raw_input("Nombre: ")
			dorsal_coche_nacionalidad_piloto[operacion] = raw_input("Nacionalidad: ")
			dorsal_coche_nacionalidad_copiloto[operacion] = raw_input("Nacionalidad: ")
			dorsal_coche_marca[operacion] = raw_input("Marca: ")
			dorsal_coche_posicion_clasificacion_general[operacion] = raw_input("Posicion: ")
