package ficherocompuestos;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class oObjeto extends lenguajes{

    int anoCreacion;
    String definicionObjeto;
    
    public oObjeto(String n, String s, int a, String d) {
        super(n, s);
        anoCreacion = a;
        definicionObjeto = d;
    }
    
    public int getAnoCreacion() {
        return anoCreacion;
    }
    
    public String getDefinicionObjeto() {
        return definicionObjeto;
    }
}
