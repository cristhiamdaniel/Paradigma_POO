// Programa Principal
package SistemaBiblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Adicionar libro.");
            System.out.println("2. Prestar libro.");
            System.out.println("3. Devolver libro.");
            System.out.println("4. Mostrar todos los libros.");
            System.out.println("5. Salir.");
            System.out.print("Digite la opcion deseada: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Digite el ISBN del libro: ");
                    String ISBN = sc.nextLine();
                    System.out.print("Digite el título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Digite el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Digite el año de publicación del libro: ");
                    int anio = sc.nextInt();
                    Libro libro = new Libro(ISBN, titulo, autor, anio);
                    biblioteca.adicionarLibro(libro);
                    System.out.println("Libro añadido con éxito!");
                    break;
                case 2:
                    System.out.print("Digite el ISBN del libro a prestar: ");
                    ISBN = sc.nextLine();
                    if (biblioteca.prestarLibro(ISBN)) {
                        System.out.println("Libro prestado con éxito!");
                    } else {
                        System.out.println("El libro no está disponible o no existe.");
                    }
                    break;
                case 3:
                    System.out.print("Digite el ISBN del libro a devolver: ");
                    ISBN = sc.nextLine();
                    if (biblioteca.devolverLibro(ISBN)) {
                        System.out.println("Libro devuelto con éxito!");
                    } else {
                        System.out.println("El libro no está prestado o no existe.");
                    }
                    break;
                case 4:
                    biblioteca.mostrarLibros();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el sistema de biblioteca!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}