package Practico_3;

public class Kata_4_Gallina {
    private static int idSiguiente = 1234; // Variable estática para generar IDs únicos
    private final int idGallina;
    private int edad;
    private int huevosPuestos;

    public Kata_4_Gallina() {

        this.idGallina = idSiguiente++;
        this.edad = 0;
        this.huevosPuestos = 0;
    }


    void ponerHuevo(){
        huevosPuestos ++;
    }

    void envejecer(){
        edad ++;
    }

    void mostrarEstado(){
        System.out.println("idGallina: " + this.idGallina + " Edad: " + this.edad + " Huevos puestos: " + this.huevosPuestos);
    }

}
