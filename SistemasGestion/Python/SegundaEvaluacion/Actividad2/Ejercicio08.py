#_*_coding:utf-8_*_

'''Vamos a crear un menú para un administrador de ficheros. Sabemos que debe trabajar con la estructura anterior.
 NOTA. EN LA CREACIÓN DEBEMOS MIRAR QUE NO EXISTA PRIMERO
/home/marta
		eje1.txt 
		eje2.txt 
		eje3.txt 
	prueba / 
		paises.txt 

	1. Mirar en que directorio nos encontramos y si es /home/marta entonces crear los tres ficheros 	eje1,eje2,eje3 con contenido el que queráis
	2. Volvemos a comprobar en que directirio me encuentro y si vuelvo a estar en /home/marta crear 	el directorio prueba.
	3. Nos cambiamos al directorio prueba y creamos paises.txt
	4. Nos damos cuenta que eje3 no se debe llamar así , debemos renombrarlo con ejercicio3
	5. Salimos del menú'''

import os
def menuFicheros():
	opt = int(raw_input("1. Mirar en que directorio nos encontramos y si es /home/marta entonces crear los tres ficheros -->eje1,eje2,eje3 con contenido el que queráis \n2. Volvemos a comprobar en que directirio me encuentro y si vuelvo a estar en /home/marta crear el directorio prueba.\n3. Nos cambiamos al directorio prueba y creamos paises.txt\n4. Nos damos cuenta que eje3 no se debe llamar así , debemos renombrarlo con ejercicio3\n5. Salimos del menu:  "))
	while not opt == 5:
		if opt == 1:
			if os.getcwd() == "/home/marta" and not os.path.isfile("eje1.txt") and not os.path.isfile("eje2.txt") and not os.path.isfile("eje3.txt"):
				eje1 = open('eje1.txt','w')
				eje2 = open('eje2.txt','w')
				eje3 = open('eje3.txt','w')
				
				eje1.write("Hola")
				eje2.write("Que tal")
				eje3.write("Adios")
				
				eje1.close()
				eje2.close()
				eje3.close()
				
				print "Ficheros creados"
			else:
				print "No se encuentra en el directorio /home/marta o el fichero ya exite"
				
		elif opt == 2:
			if os.getcwd() == "/home/marta" and not os.path.isdir('prueba2'):
				os.mkdir('prueba2')
			else:
				print "No se encuentra en el directorio /home/marta o ya existe el directorio prueba2"
		
		elif opt == 3:
			
			os.chdir('prueba2')
			print os.getcwd()
			if not os.path.isfile("paises.txt"):
				paises = open('paises.txt','w')	
				paises.write('España')
				paises.close()
				print "Fichero paises creado"
			else:
				print "El fichero ya existe"
		
		elif opt == 4:
			if os.getcwd() == "/home/marta":
				os.rename("eje3.txt","ejemplo3.txt")
			else:
				os.chdir('/home/marta')
				os.rename("eje3.txt","ejemplo3.txt")
			
		print "\n\n\n"
		opt = int(raw_input("1. Mirar en que directorio nos encontramos y si es /home/marta entonces crear los tres ficheros -->eje1,eje2,eje3 con contenido el que queráis \n2. Volvemos a comprobar en que directirio me encuentro y si vuelvo a estar en /home/marta crear el directorio prueba.\n3. Nos cambiamos al directorio prueba y creamos paises.txt\n4. Nos damos cuenta que eje3 no se debe llamar así , debemos renombrarlo con ejercicio3\n5. Salimos del menu:  "))
		
menuFicheros()
