package ficherocompuestos;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class lenguajes {

    String nombreLenguaje;
    String software;

    public lenguajes(String n, String s) {
        nombreLenguaje = n;
        software = s;
    }

    public String getNombreLenguaje() {
        return nombreLenguaje;
    }

    public String getSoftware() {
        return software;
    }
}
