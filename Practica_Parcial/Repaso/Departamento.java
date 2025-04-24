package Practica_Parcial.Repaso;

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Oficina> oficinas;

    public Departamento(String nombre){
        this.nombre = nombre;
        this.oficinas = new ArrayList<>();
    }

    public void agregarOficina(Oficina oficina){
        this.oficinas.add(oficina);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficina(ArrayList<Oficina> oficina) {
        this.oficinas = oficina;
    }
}
