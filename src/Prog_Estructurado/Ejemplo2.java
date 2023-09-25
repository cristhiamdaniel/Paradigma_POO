package Prog_Estructurado;

/*
Implemente una funcion que reciba dos vectores ordenados,
y los mezcle en un tercero
 */
import java.util.Vector;

public class Ejemplo2 {

    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(1);
        vector1.add(3);
        vector1.add(5);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(2);
        vector2.add(4);
        vector2.add(6);

        Vector<Integer> vectorMezclado = mezclarVectores(vector1, vector2);
        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);
        System.out.println("Vector mezclado: " + vectorMezclado);
    }

    public static Vector<Integer> mezclarVectores(Vector<Integer> vector1, Vector<Integer> vector2) {
        Vector<Integer> vectorMezclado = new Vector<>();
        int i = 0, j = 0;

        while (i < vector1.size() && j < vector2.size()) {
            if (vector1.get(i) < vector2.get(j)) {
                vectorMezclado.add(vector1.get(i));
                i++;
            } else {
                vectorMezclado.add(vector2.get(j));
                j++;
            }
        }

        while (i < vector1.size()) {
            vectorMezclado.add(vector1.get(i));
            i++;
        }

        while (j < vector2.size()) {
            vectorMezclado.add(vector2.get(j));
            j++;
        }

        return vectorMezclado;
    }
}
