package Aproximacion4;

public class Empleado {
    final private String cedula;
    private String apellido;
    private String nombre;
    private double horasTrabajadas;
    private double sueldoXHora;

    public Empleado(String cedula, String apellido, String nombre, double horasTrabajadas, double sueldoXHora) {
        if (cedula != null){
            this.cedula = cedula;
        } else {
            this.cedula = "";
        }
        setApellido(apellido);
        setNombre(nombre);
        setHorasTrabajadas(horasTrabajadas);
        setSueldoXHora(sueldoXHora);
    }

    public double calcularSalario(){

        return horasTrabajadas * sueldoXHora;
    }

    public String getCedula() {
        return cedula;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        if (apellido != null){
            this.apellido = apellido;
        } else {
            this.apellido = "";
        }
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    private void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas >= 0){
            this.horasTrabajadas = horasTrabajadas;
        } else {
            this.horasTrabajadas = 0;
        }
    }

    public double getSueldoXHora() {
        return sueldoXHora;
    }

    private void setSueldoXHora(double sueldoXHora) {
        if (sueldoXHora >= 0){
            this.sueldoXHora = sueldoXHora;
        } else {
            this.sueldoXHora = 0;
        }
    }
}
