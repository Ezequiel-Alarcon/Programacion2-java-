package Practica_Parcial.Repaso;

public class Empleado extends Persona {

    private int legajo;
    private TipoContrato tipoContrato;

    public Empleado(String nombre, String dni, int legajo, TipoContrato tipoContrato) {
        super(nombre, dni);
        this.legajo = legajo;
        this.tipoContrato = tipoContrato;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }


}