#_*_coding:utf-8_*_
import pickle

lista = ['Perl','Python','Ruby']

# Abrimos un fichero
archivo = open ('C:\petra\ejemplo.dat','wb')

# Método que vuelca la lista al archivo
pickle.dump (lista,archivo) # carga la lista al archivo
archivo.close()

# Leemos el archivo
archivo = open ('c:\petra\ejemplo.dat','rb')

# Cargamos la lista desde el archivo
lista = pickle.load(archivo)
print (lista)
archivo.close()
