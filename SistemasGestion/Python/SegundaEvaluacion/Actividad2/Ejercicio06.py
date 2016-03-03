
import os
ruta=raw_input("Introduce la ruta: ")

if(os.path.isdir(ruta)):
    print "Muestra los directorios:\n"
    for base, dirs, files in os.walk(ruta):
        print dirs

    raw_input("Pulsa una tecla para continuar...")
    print "Muestra los directorios:\n"
    for base, dirs, files in os.walk(ruta):
        print files
else:
    print "Lo introducido no es una ruta."