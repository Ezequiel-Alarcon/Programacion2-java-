package Practico_4;

public class Prueba_4 {
    public static void main(String[] args) {
        int totalEmpleados;

        // Creación de empleados
        Empleado empleado1 = new Empleado("Jose", 123, "Desarrollador de software", 10000);
        Empleado empleado2 = new Empleado("Mario", 1234, "Marketing", 8000);
        Empleado empleado3 = new Empleado("Pepito", 1235, "Ciberseguridad", 10000);
        Empleado empleado4 = new Empleado("Maria", "Desarrollador de software");

        // Mostrar empleados sin modificar
        System.out.println("=== Empleados sin modificar ===\n");

        System.out.println(empleado1 + "\n");
        System.out.println(empleado2 + "\n");
        System.out.println(empleado3 + "\n");
        System.out.println(empleado4 + "\n");

        // Modificando los salarios
        empleado1.actualizarSalario(5000);    // Aumento fijo
        empleado2.actualizarSalario(0.3);     // Aumento porcentaje
        empleado3.actualizarSalario(1200);    // Aumento fijo
        empleado4.actualizarSalario(0.2);     // Aumento porcentaje

        // Mostrar empleados con salarios modificados
        System.out.println("=== Empleados modificados ===\n");

        System.out.println(empleado1 + "\n");
        System.out.println(empleado2 + "\n");
        System.out.println(empleado3 + "\n");
        System.out.println(empleado4 + "\n");

        // Mostrar total de empleados
        totalEmpleados = Empleado.mostrarTotalEmpleados();
        System.out.println("Total de empleados: " + totalEmpleados);
    }
}

