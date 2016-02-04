#_*_coding:utf-8_*_

'''
Obtener la fecha y hora actual en Python usando el módulo correspondiente
La salida que debemos ver es:
Fecha y hora = 2014-05-23 18:05:04.597000
Fecha y hora en formato ISO = 2014-05-23T18:05:04.597000
Año = 2014
Mes = 5
Dia = 23
Formato dd/mm/yyyy = 23/5/2014
Hora = 18
Minutos = 5
Segundos = 4
Formato hh:mm:ss = 18:5:4
ojo( modificando los datos con los del día del ejercicio)
'''

import time

# main

print time.strftime("%H:%M:%S")
