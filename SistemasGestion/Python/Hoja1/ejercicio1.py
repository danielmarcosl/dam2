#_*_coding:utf-8_*_

# Inicializacion de variables con datos
nombre = "Daniel"
apellidos = "Marcos Lorrio"
edad = 22
dni = "12345678C"
domicilio = "mi calle"

# Imprimir una cadena en la que salgan todas las variables
print "Tu nombre es " + str(nombre) + "\nTus apellidos son " + str(apellidos) + "\nTu edad es " + str(edad) + "\nTu dni es " + str(dni) + "\nTu domicilio es " + str(domicilio) + "\n"

# Pedir al usuario que introduzca sus datos
nombre = raw_input("Introduce tu nombre: ")
apellidos = raw_input("Introduce tus apellidos: ")
edad = raw_input("Introduce tu edad: ")
dni = raw_input("Introduce tu dni: ")
domicilio = raw_input("Introduce tu domicilio: ")

# Imprimir los datos dle usuario en una cadena
print "Tu nombre es " + str(nombre) + "\nTus apellidos son " + str(apellidos) + "\nTu edad es " + str(edad) + "\nTu dni es " + str(dni) + "\nTu domicilio es " + str(domicilio) + "\n"
