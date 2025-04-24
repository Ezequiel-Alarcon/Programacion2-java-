package Practica_Parcial.Repaso;

import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[] args) {
        //Creamos la oficina y el departamento
        // Crear departamentos
        Departamento departamento1 = new Departamento("Recursos Humanos");
        Departamento departamento2 = new Departamento("Tecnología");

        // Crear y agregar oficinas a RRHH
        departamento1.agregarOficina(new Oficina(101, 1));
        departamento1.agregarOficina(new Oficina(102, 1));

        departamento2.agregarOficina(new Oficina(201, 2));
        departamento2.agregarOficina(new Oficina(202, 2));


        //Creamos los empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", "12345678", 123456, TipoContrato.TIEMPO_COMPLETO));
        empleados.add(new Empleado("Maxi", "51156457", 123456, TipoContrato.FREELANCE));
        empleados.add(new Empleado("Pedro", "51156457", 123456, TipoContrato.MEDIO_TIEMPO));


        //Creamos los departamentos
        ArrayList<Departamento> departamentos = new ArrayList<>();
        departamentos.add(departamento1);
        departamentos.add(departamento2);

        //Creamos la empresa
        Empresa empresa = new Empresa("POTATOS ESPRESs","30-12345678-9",empleados,departamentos);
        empresa.asignarEmpleado(new Empleado("Lucía", "44112233", 56789, TipoContrato.TEMPORAL));

        //Mostrar la estructura de la empresa
        empresa.mostrarEstructura();
    }
}
