package Practico_3;

public class Kata_5 {
    public static void main(String[] args) {
        Kata_5_NaveEspacial nave = new Kata_5_NaveEspacial(50, "Power");

        if (!nave.despegar()) {
            System.out.println("No se pudo despegar.");
        }

        if (!nave.avanzar(60)) {
            System.out.println("No se pudo avanzar.");
        }

        if (nave.recargarCombustible(40)) {
            System.out.println("Recarga exitosa.");
        }

        if (nave.avanzar(60)) {
            System.out.println("Avance exitoso.");
        }

        nave.mostrarEstado();
    }

}
