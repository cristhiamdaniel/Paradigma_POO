package Aproximaciones;

import java.util.Scanner;

class Empleado {
    String cedula;
    String apellido;
    String nombre;
    double horasTrabajadas;
    double sueldoXHora;
}

class Nomina1 {
    public static void main(String[] args) {
        int numeroEmpleados;
        Empleado[] losEmpleados = new Empleado[50];
        String cedula, apellido, nombre;
        double horas, sueldo;
        double total = 0;

        Scanner sc = new Scanner(System.in); // Usamos Scanner en lugar de BufferedReader

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

            Empleado unEmpleado = new Empleado();
            unEmpleado.cedula = cedula;
            unEmpleado.apellido = apellido;
            unEmpleado.nombre = nombre;
            unEmpleado.horasTrabajadas = horas;
            unEmpleado.sueldoXHora = sueldo;

            losEmpleados[i] = unEmpleado;

            sc.nextLine(); // Consume el salto de línea restante si hay más datos para leer después
        }

        for (int i = 0; i < numeroEmpleados; i++) {
            total = total + losEmpleados[i].sueldoXHora * losEmpleados[i].horasTrabajadas;
        }

        System.out.println("\nLa nomina total es: " + total);

        sc.close(); // Cerramos el Scanner
    }
}
