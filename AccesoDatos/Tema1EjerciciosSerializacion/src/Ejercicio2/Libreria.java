package Ejercicio2;

/**
 *
 * @author Alumnot
 */
public class Libreria {

    String titulo;
    String autor;
    String editorial;
    int isbn;
    
    public void nuevaLibreria(String ti, String au, String ed, int is) {
        titulo = ti;
        autor = au;
        editorial = ed;
        isbn = is;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getEditorial() {
        return editorial;
    }
    
    public int getISBN() {
        return isbn;
    }
}
