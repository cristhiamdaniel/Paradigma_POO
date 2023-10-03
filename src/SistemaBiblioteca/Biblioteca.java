// Clase Biblioteca
package SistemaBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> listaLibros;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    public void adicionarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public boolean prestarLibro(String ISBN) {
        for (Libro libro : listaLibros) {
            if (libro.getISBN().equals(ISBN) && !libro.estaPrestado()) {
                libro.prestarLibro();
                return true;
            }
        }
        return false;
    }

    public boolean devolverLibro(String ISBN) {
        for (Libro libro : listaLibros) {
            if (libro.getISBN().equals(ISBN) && libro.estaPrestado()) {
                libro.devolverLibro();
                return true;
            }
        }
        return false;
    }

    public void mostrarLibros() {
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }
}