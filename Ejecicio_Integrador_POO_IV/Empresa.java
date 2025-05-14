package Ejecicio_Integrador_POO_IV;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void mostrarSalarios(){
        for (Empleado emp :empleados){
            System.out.println("Nombre: "+emp.nombreCompleto()+" Salario: "+emp.getSalario());
        }
    }

    public Empleado empleadoConMasClientes(){
        int max = -1;
        Empleado elMayor = null;
        for (Empleado emp :empleados){
            if (emp instanceof EmpleadoAcomision){
                EmpleadoAcomision eac = (EmpleadoAcomision) emp;
                int cant = eac.getCantClientesCaptados();
                if (cant > max){
                    max = cant;
                    elMayor = emp;
                }

            }
        }
        return elMayor;
    }
}
