package Ejecicio_Integrador_POO_IV;

import java.time.LocalDate;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public abstract double getSalario();

    public String nombreCompleto(){
        return nombre + " " + apellido;
    }

    public int antiguedadEnAnios(){
        int anioActual = LocalDate.now().getYear();
        return anioActual-anioIngreso;
    }


}
