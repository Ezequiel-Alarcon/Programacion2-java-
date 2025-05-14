package Ejecicio_Integrador_POO_IV;

public class EmpleadoAcomision extends Empleado {

    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAcomision(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo, int cantClientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public double getSalario() {
        double salario = cantClientesCaptados * montoPorCliente;;

        if(salario < salarioMinimo){
            salario = salarioMinimo;
        }
        return salario;
    }

    public int getCantClientesCaptados() {
        return cantClientesCaptados;
    }
}
