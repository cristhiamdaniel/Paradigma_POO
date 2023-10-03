package Aproximacion3;

import java.util.Scanner;

public class Nomina {
    public static void main(String[] args) {
        int numeroEmpleados;
        Empleado[] losEmpleados = new Empleado[50];
        String cedula, apellido, nombre;
        double horas, sueldo;
        double total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el numero de empleados: ");
        numeroEmpleados = sc.nextInt();

        sc.nextLine(); // Consume el salto de línea restante

        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.print("\nDigite la cedula del empleado: ");
            cedula = sc.nextLine();
            System.out.print("\nDigite el apellido del empleado: ");
            apellido = sc.nextLine();
            System.out.print("\nDigite el nombre del empleado: ");
            nombre = sc.nextLine();
            System.out.print("\nDigite num de horas trabajadas del empleado: ");
            horas = sc.nextDouble();
            System.out.print("\nDigite el sueldo por hora del empleado: ");
            sueldo = sc.nextDouble();

            Empleado unEmpleado = new Empleado(cedula, apellido, nombre, horas, sueldo);

            losEmpleados[i] = unEmpleado;

            sc.nextLine();
        }

        for (int i = 0; i < numeroEmpleados; i++) {
            total = total + losEmpleados[i].calcularSalario();
        }

        System.out.println("\nLa nomina total es: " + total);

        sc.close();
    }

}
