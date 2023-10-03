package Aproximacion2;

class Empleado {
    String cedula;
    String apellido;
    String nombre;
    double horasTrabajadas;
    double sueldoXHora;

    Empleado(String cedula, String apellido, String nombre, double horasTrabajadas, double sueldoXHora) {
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoXHora = sueldoXHora;
    }

    double calcularSalario(){

        return horasTrabajadas * sueldoXHora;
    }
}