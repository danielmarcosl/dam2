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
		
		print '''Bienvenido al menu de motos del Rally Dakar

Selecciona una opcion:

1. Mostrar
2. Anadir
3. Modificar
5. Atras
'''

		operacion = int(raw_input("Tu opcion: "))
	
		if operacion == 1:
			print '''Bienvenido al menu de motos del Rally Dakar
		
1. Consultar todos los datos de motos
2. Consultar nombres y nacionalidades (motos)
3. Consultar marcas de motos
4. Consultar clasificaciones de motos
16. Atras
'''


			operacion = int(raw_input("Tu opcion: "))

			if operacion == 1 :
			elif operacion == 2 :
			elif operacion == 3 :
	
	

	
	elif operacion == 2 :
		print '''Bienvenido al menu de coches del Rally Dakar
		
5. Consultar todos los datos de coches
6. Consultar nombres y nacionalidades (coches)
7. Consultar marcas de coches
8. Consultar clasificaciones de coches
24. Atras'''
