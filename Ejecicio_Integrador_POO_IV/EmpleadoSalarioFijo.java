package Ejecicio_Integrador_POO_IV;

public class EmpleadoSalarioFijo extends Empleado {
    private static final double PORC1 = 0.05;
    private static final double PORC2 = 0.1;
    private int anio1 = 2;
    private int anio2 = 5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double getSalario() {
        return sueldoBasico + sueldoBasico * porcAdicional();
    }

    public double porcAdicional(){
        int ant = antiguedadEnAnios();
        double porc = 0;

        if(ant > anio2){
            porc = PORC2;
        }else if(ant >= anio1){
            porc = PORC1;
        }
        return porc;
    }
}
