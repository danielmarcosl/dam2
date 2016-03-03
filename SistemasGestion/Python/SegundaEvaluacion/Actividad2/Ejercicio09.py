import subprocess as s

#Metodos para crear el fichero pasando un fichero como parametro
def crearFichero(fichero):
	s.call("touch "+fichero,shell=True)
	
#Metodo para listar el contenido de un directorio con sus detalles
def listar(directorio):
	return s.call("ls -l"+directorio,shell=True)

#Metodo para cambiar los permisos a un fichero
def cambiarPermisos(permisos,fichero):
	s.call('chmod '+permisos+' '+fichero,shell=True)

#Declaro las variables a utilizar
directorio = "/home/hpjones/Escritorio"
fichero = "/home/hpjones/Escritorio/permisos.txt"
permisos = '777'

#Creo el fichero con el metodo
crearFcihero(fichero)

#Se lista el fichero con sus permisos inciales
print listar(directorio)


#Cambio permisos con el metodo	
cambiarPermisos(permisos,fichero)

#Vuelvo a listar el directorio para comprobar el cambio
print listar(directorio)

