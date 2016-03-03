# -*- coding: utf-8 -*-


'''La finalidad del programa es debuguear un codigo con pdb'''

import pdb #importa la librería pdb. El modulo pdb nos sirve para controlar paso a paso la ejecucion de nuestros programas
		   #obteniendo el lugar exacto y el porque falla el codigo
from subprocess import call, Popen, PIPE 

'''
Call: suele ser util para ejecutar ordenes sencillas

Popen: sirve para ejecutar ordenes al igual que call, pero nos permite controlar mejor la salida. Como primer argumento se pasa
	   una lista con dos elementos, el primero es el comando y el segundo la lista de argumentos.

PIPE: tuberia para capturar las entradas y salidas del popen. Hay que pasar el stdout y le stderr como argumentos clave,
	  y el PIPE como valor de cada uno de ellos, lo que nos permite acceder a su lectura como si fuesen cualquier otro archivo
'''


call("clear") # Limpiar la pantalla

pdb.Pdb().set_trace() #linea a partir de la cual deseas que que el programa se ejecute "paso a paso" para descubrir el error

proceso = Popen(['ls', '-lha'], stdout=PIPE, stderr=PIPE) #Obtiene un listado con los archivos y directorios. Almacena en 
														  #stdout y stderr los datos obtenidos y en el caso que haya, los errores

error_encontrado = proceso.stderr.read() #Almacena los errores en la variable error_encontrado

proceso.stderr.close() #Cierra el stderr

listado = proceso.stdout.read() #Almacena el listado del resultado en la variable listado

proceso.stdout.close() #Cierra el stdout

if not error_encontrado: #Si no hay errores en la lista de errores imprime el la lista con los resultados obtenidos 
    print listado
else: #Si hay errores en la lista de errores los imprime
    print "Se produjo el siguiente error:\n%s" % error_encontrado
    
'''
n (next) ejecuta el código mostrado y salta a la siguiente línea de tu archivo
s (step) te mostrará paso a paso el camino recorrido 
         hasta poder ejecutar la siguiente línea de tu archivo
c (continue) ejecuta el archivo hasta encontrar un punto de quiebre
q (quit) abandonar el debugger
'''
