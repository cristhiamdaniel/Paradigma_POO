package Prog_Estructurado;

/*
Desarrolle un programa que recibe una cadena de caracteres (una línea),
y comprueba si es un palíndromo. Para ello, debe eliminar acentos,
convertir las mayúsculas a minúsculas, y eliminar todos los caracteres
que no corresponden a letras.
El resultado deberá ser analizado para comprobar si es palíndromo.
Por ejemplo, con la cadena “Dábale arroz a la zorra el abad”,
deberá devolver que es palíndromo.
 */
import java.text.Normalizer;

public class Ejemplo4 {

    public static void main(String[] args) {
        String cadena = "Dábale arroz a la zorra el abad";
        boolean esPalindromo = esPalindromo(cadena);
        System.out.println("Cadena: " + cadena);
        System.out.println("¿Es palíndromo? " + esPalindromo);
    }

    public static boolean esPalindromo(String cadena) {
        String cadenaLimpia = limpiarCadena(cadena);
        String cadenaReversa = new StringBuilder(cadenaLimpia).reverse().toString();
        return cadenaLimpia.equals(cadenaReversa);
    }

    public static String limpiarCadena(String cadena) {
        // Convertir a minúsculas
        cadena = cadena.toLowerCase();
        // Eliminar acentos
        cadena = Normalizer.normalize(cadena, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        // Eliminar caracteres que no son letras
        cadena = cadena.replaceAll("[^a-z]", "");
        return cadena;
    }
}
