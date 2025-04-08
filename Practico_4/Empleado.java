package Practico_4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;


    public Empleado(String nombre, int id, String puesto, double salario) {
        this.puesto = puesto;
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        totalEmpleados = totalEmpleados + 1;
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        totalEmpleados = totalEmpleados + 1;
        this.id = 123456789;
        this.salario = 15000.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void actualizarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }


    public void actualizarSalario(int aumentoFijo) {
        salario += aumentoFijo;
    }


    @Override
    public String toString() {
        return "----- Empleado -----\n" +
                "ID: " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "Puesto: " + puesto + "\n" +
                "Salario: $" + String.format("%.2f", salario) + "\n";
    }


    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

}
