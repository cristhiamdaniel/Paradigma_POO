package Aproximacion4;

import java.util.Scanner;

public class Nomina2 {
    public static void main(String[] args){
        int numeroEmpleados=0, opcionMenu=0;
        Empleado[] losEmpleados = new Empleado[50];
        String cedula, apellido, nombre;
        double horas, sueldo;
        double total = 0;

        Scanner sc = new Scanner(System.in);

        while(opcionMenu!=3){
            System.out.println("Menu de opciones");
            System.out.println("1. Adicionar Empleado");
            System.out.println("2. Calcular Nomina total");
            System.out.println("3. Salir");
            System.out.println("Digite la opcion deseada: ");
            opcionMenu = sc.nextInt();


            sc.nextLine();

            if (opcionMenu==1){
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

                losEmpleados[numeroEmpleados] = unEmpleado;

                numeroEmpleados++;

                sc.nextLine();
            }
            else if (opcionMenu==2){
                for (int i = 0; i < numeroEmpleados; i++) {
                    total = total + losEmpleados[i].calcularSalario();
                }

                System.out.println("\nLa nomina total es: " + total);
            }


        }

    }
}
