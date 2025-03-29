package Practico_3;
/*
Enunciado
Imagina que estás desarrollando un sistema de gestión de mascotas para un refugio de
animales.
Debes modelar la clase Mascota con los siguientes atributos y métodos:
● Atributos:
nombre
especie
edad
● Métodos:
mostrarInfo()
cumplirAnios().
 */
public class Kata_2 {
    public static void main(String[] args) {
        Kata_2_Mascota mascota = new Kata_2_Mascota();

        mascota.nombre = "loki";
        mascota.edad = 0;
        mascota.especie = "Perro";

        mascota.mostrarInfo();

        mascota.cumplirAnios();

        mascota.mostrarInfo();

    }
}
