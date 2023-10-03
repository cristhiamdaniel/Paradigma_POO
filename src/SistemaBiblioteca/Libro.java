// Clase Libro
package SistemaBiblioteca;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean estaPrestado;

    public Libro(String ISBN, String titulo, String autor, int anioPublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.estaPrestado = false;
    }

    public void prestarLibro() {
        this.estaPrestado = true;
    }

    public void devolverLibro() {
        this.estaPrestado = false;
    }

    // Getters y setters según sea necesario.
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean estaPrestado() {
        return estaPrestado;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + ", Autor: " + autor + ", Año: " + anioPublicacion + (estaPrestado ? " (Prestado)" : " (Disponible)");
    }
}
