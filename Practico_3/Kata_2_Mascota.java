package Practico_3;

public class Kata_2_Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre:"+nombre+"\t"+"Especie:"+especie+"\t"+"Edad:"+edad);
    }

    void cumplirAnios(){
        edad ++;
    }
}
