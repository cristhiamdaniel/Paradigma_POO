package Prog_Estructurado;

/*
Implemente una funcion que reciba un vector como entrada y obtenga un nuevo
vector, con los elementos sin incluir repetidos.
*/

import java.util.Vector;
import java.util.HashSet;

public class Ejemplo1 {

    public static void main(String[] args) {
        Vector<Integer> vectorOriginal = new Vector<>();
        vectorOriginal.add(1);
        vectorOriginal.add(2);
        vectorOriginal.add(2);
        vectorOriginal.add(3);
        vectorOriginal.add(4);
        vectorOriginal.add(4);
        vectorOriginal.add(5);

        Vector<Integer> vectorSinRepetidos = obtenerSinRepetidos(vectorOriginal);
        System.out.println("Vector original: " + vectorOriginal);
        System.out.println("Vector sin repetidos: " + vectorSinRepetidos);
    }

    public static Vector<Integer> obtenerSinRepetidos(Vector<Integer> vectorOriginal) {
        HashSet<Integer> conjunto = new HashSet<>(vectorOriginal);
        return new Vector<>(conjunto);
    }
}
