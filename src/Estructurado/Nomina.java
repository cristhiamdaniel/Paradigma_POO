package Estructurado;

import java.util.Scanner;

class Nomina{
    public static void main(String[] args) {
        int numeroEmpleados;
        String[] cedulas = new String[50];
        String[] apellidos = new String[50];
        String[] nombres = new String[50];
        double[] horasTrabajadas = new double[50];
        double[] sueldoXHora = new double[50];
        String cedula, apellido, nombre;
        double horas, sueldo;
        double total = 0;

        Scanner sc = new Scanner(System.in); // Usamos Scanner en lugar de BufferedReader

        System.out.println("Digite el numero de empleados: ");
        numeroEmpleados = sc.nextInt();

        sc.nextLine(); // Consume el salto de línea restante

        for(int i=0; i<numeroEmpleados; i++){
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
            cedulas[i] = cedula;
            apellidos[i] = apellido;
            nombres[i] = nombre;
            horasTrabajadas[i] = horas;
            sueldoXHora[i] = sueldo;

            sc.nextLine(); // Consume el salto de línea restante
        }

        for(int i = 0; i< numeroEmpleados; i++){
            total = total + sueldoXHora[i]*horasTrabajadas[i];
        }

        System.out.println("\nLa nomina total es: " + total);
        sc.close(); // Cerramos el Scanner
    }
}
