package Practica_Parcial.Repaso;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String cuit;
    private ArrayList<Empleado> empleados;
    private ArrayList<Departamento> depto;

    public Empresa(String nombre, String cuit, ArrayList<Empleado> empleados, ArrayList<Departamento> depto) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = empleados;
        this.depto = depto;
    }

    public void agregarDepartamento(Departamento depto){
        this.depto.add(depto);
    }

    public void agregarEmpleado(ArrayList<Empleado> emp){
        this.empleados = emp;
    }

    public void asignarEmpleado(Empleado emp){
        this.empleados.add(emp);
    }


    public void mostrarEstructura(){
        System.out.println("Estructura de la empresa " + this.nombre + ":");
        System.out.println("----------------------------------------");

        if (depto == null || depto.isEmpty()) {
            System.out.println("No hay departamentos registrados.");
            return;
        }

        for (Departamento dpto : depto) {
            System.out.println("Departamento: " + dpto.getNombre());

            // Mostrar las oficinas del departamento
            List<Oficina> oficinas = dpto.getOficinas();
            if (oficinas == null || oficinas.isEmpty()) {
                System.out.println("\t- Sin oficinas asignadas");
            } else {
                for (Oficina ofi : oficinas) {
                    System.out.println("\t- Oficina: Piso " + ofi.getPiso() +
                            ", Número " + ofi.getNumero());
                }
            }
            System.out.println();
        }

    }

}
