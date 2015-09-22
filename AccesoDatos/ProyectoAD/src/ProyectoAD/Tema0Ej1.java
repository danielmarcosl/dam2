package ProyectoAD;

public class Tema0Ej1 {

    public class Persona {

        String rut;
        String nombre;

        public String getnombre() {
            return nombre;
        }

        public String getrut() {
            return rut;
        }

        public void setnombre(String n) {
            nombre = n;
        }

        public void setrut(String r) {
            rut = r;
        }
    }

    public static void main(String args[]) {

        //Debemos crear una clase Persona con los siguientes datos
        //( rut, y nombre ambos de tipo string)
        //Dicha clase tendrá los métodos get para el nombre ,rut y después
        //sobrecargar  el método ToString en el que mostraremos el rut y el nombre.
        //Vamos a guardar el objeto Persona en un Arraylist, una vez hecho debemos
        //usar el patron iterator para mostrar los datos
    }
}
