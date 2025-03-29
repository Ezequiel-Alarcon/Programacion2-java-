package Practico_3;

public class Kata_4 {
    public static void main(String[] args) {
        // Crear dos gallinas con IDs únicos
        Kata_4_Gallina g1 = new Kata_4_Gallina();
        Kata_4_Gallina g2 = new Kata_4_Gallina();

        // Mostrar el estado de las gallinas
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Las gallinas ponen huevos y envejecen
        g1.ponerHuevo();
        g1.envejecer();
        g2.ponerHuevo();
        g2.envejecer();

        // Mostrar el estado actualizado de las gallinas
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
