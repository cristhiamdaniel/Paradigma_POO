package Prog_Estructurado;

/*
Implemente una funcion que reciba una cadena de caracteres, y la
modifique para que contenga unicamente la primera palabra
(considere que, si tiene mas de una palabara, estan separadas
por espacios o tabuladores)
 */
public class Ejemplo3{

    public static void main(String[] args) {
        String cadena = "Hola, ¿cómo estás?";
        String primeraPalabra = obtenerPrimeraPalabra(cadena);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Primera palabra: " + primeraPalabra);
    }

    public static String obtenerPrimeraPalabra(String cadena) {
        String[] palabras = cadena.split("\\s+"); // Dividir por espacios o tabuladores
        return palabras[0];
    }
}
